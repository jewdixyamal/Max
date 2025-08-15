package defpackage;

/* renamed from: mi6  reason: default package */
public enum mi6 implements oi6 {
    VIRTUAL_KEY(1),
    KEYBOARD_TAP(3),
    CONTEXT_CLICK(6),
    GESTURE_START(12),
    CONFIRM(16);
    
    public final int a;

    /* access modifiers changed from: public */
    mi6(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }
}
