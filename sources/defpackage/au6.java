package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: au6  reason: default package */
public final class au6 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ bu6 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au6(bu6 bu6, int i) {
        super(9, (Object) null);
        this.c = i;
        this.o = bu6;
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
                bu6 bu6 = this.o;
                bu6.post(new re(28, bu6));
                return;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    Drawable drawable = (Drawable) obj2;
                    Drawable drawable2 = (Drawable) obj;
                    bu6 bu62 = this.o;
                    ((la6) bu62.getHierarchy()).k(bu62.getOverlayDrawable());
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    yt6 yt6 = (yt6) obj;
                    this.o.setup((yt6) obj2);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au6(Object obj, bu6 bu6) {
        super(9, obj);
        this.c = 2;
        this.o = bu6;
    }
}
