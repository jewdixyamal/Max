package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: xre  reason: default package */
public final class xre extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ zre o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xre(Object obj, zre zre, int i) {
        super(9, obj);
        this.c = i;
        this.o = zre;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    zre zre = this.o;
                    zre.onThemeChanged(zre.getTheme());
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    Drawable drawable = (Drawable) obj;
                    this.o.setBackground((Drawable) obj2);
                    return;
                }
                return;
        }
    }
}
