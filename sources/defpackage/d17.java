package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: d17  reason: default package */
public final class d17 extends u2 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ e17 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d17(e17 e17) {
        super(9, (Object) null);
        this.o = e17;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    Drawable drawable = (Drawable) obj2;
                    Drawable drawable2 = (Drawable) obj;
                    if (drawable != null) {
                        drawable.setBounds(this.o.getBounds());
                        return;
                    }
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    int intValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    e17 e17 = this.o;
                    e17.d.setColor(intValue);
                    e17.invalidateSelf();
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d17(Integer num, e17 e17) {
        super(9, (Object) num);
        this.o = e17;
    }
}
