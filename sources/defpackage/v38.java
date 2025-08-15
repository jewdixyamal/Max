package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: v38  reason: default package */
public final class v38 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ w38 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v38(w38 w38, int i) {
        super(9, (Object) null);
        this.c = i;
        this.o = w38;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                ru6 ru6 = (ru6) obj2;
                ru6 ru62 = (ru6) obj;
                Integer num = null;
                if (tpa.f(ru62 != null ? Integer.valueOf(ru62.getWidth()) : null, ru6 != null ? Integer.valueOf(ru6.getWidth()) : null)) {
                    Integer valueOf = ru62 != null ? Integer.valueOf(ru62.getHeight()) : null;
                    if (ru6 != null) {
                        num = Integer.valueOf(ru6.getHeight());
                    }
                    if (tpa.f(valueOf, num)) {
                        return;
                    }
                }
                w38 w38 = this.o;
                w38.post(new q57(7, w38));
                return;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    yt6 yt6 = (yt6) obj;
                    this.o.setup((yt6) obj2);
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    Drawable drawable = (Drawable) obj2;
                    Drawable drawable2 = (Drawable) obj;
                    w38 w382 = this.o;
                    ((la6) w382.getHierarchy()).k(w382.getOverlayDrawable());
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v38(Object obj, w38 w38) {
        super(9, obj);
        this.c = 1;
        this.o = w38;
    }
}
