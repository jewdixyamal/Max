package defpackage;

import android.text.style.StyleSpan;

/* renamed from: wp0  reason: default package */
public final class wp0 extends StyleSpan implements yz7 {
    public final /* synthetic */ int a;
    public final int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wp0(int i) {
        super(1);
        this.a = i;
        switch (i) {
            case 1:
                super(2);
                this.b = 3;
                return;
            default:
                this.b = 2;
                return;
        }
    }

    public final uw3 copy() {
        switch (this.a) {
            case 0:
                return new wp0(0);
            default:
                return new wp0(1);
        }
    }

    public final int getType() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }
}
