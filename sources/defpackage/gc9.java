package defpackage;

import android.text.style.TypefaceSpan;

/* renamed from: gc9  reason: default package */
public final class gc9 extends TypefaceSpan implements yz7 {
    public final int a = 5;

    public gc9() {
        super("monospace");
    }

    public final uw3 copy() {
        return new gc9();
    }

    public final int getType() {
        return this.a;
    }
}
