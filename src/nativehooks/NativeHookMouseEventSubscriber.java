package nativehooks;

import globalListener.NativeMouseEvent;

public interface NativeHookMouseEventSubscriber {
	public void processMouseEvent(NativeMouseEvent event);
}