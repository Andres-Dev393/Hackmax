// @input Component.ScriptComponent attachmentBindingLeft
// @input Component.ScriptComponent attachmentBindingRight
// @input SceneObject hintObject


var updateEvent = script.createEvent("UpdateEvent");
updateEvent.bind(onUpdate);


function onUpdate() {
    var leftVisible = false;
    var rightVisible = false;
    
    if (script.attachmentBindingLeft && script.attachmentBindingLeft.api.getBinding() && script.attachmentBindingLeft.api.getBinding().isVisible) {
        leftVisible = true;
    }
    
    
    if (script.attachmentBindingRight && script.attachmentBindingRight.api.getBinding() && script.attachmentBindingRight.api.getBinding().isVisible) {
        rightVisible = true;    
    }
    
    if (leftVisible) {
        global.behaviorSystem.sendCustomTrigger("LEFT_FOOT_FOUND");
        global.tweenManager.startTween(script.hintObject, "hide_hint");
    }
    
    if (rightVisible) {
        global.behaviorSystem.sendCustomTrigger("RIGHT_FOOT_FOUND");
        global.tweenManager.startTween(script.hintObject, "hide_hint");
    }
    
    if (leftVisible && rightVisible) {
        updateEvent.enabled = false;
    }
}