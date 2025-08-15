package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import ru.ok.utils.widgets.BadgeCountView;

/* renamed from: sc0  reason: default package */
public final class sc0 extends u2 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ Object o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public sc0(defpackage.tc0 r2, defpackage.fka r3) {
        /*
            r1 = this;
            r0 = 0
            r1.c = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.o = r2
            r1.X = r3
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc0.<init>(tc0, fka):void");
    }

    public final void L1(Object obj, Object obj2) {
        int i;
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    tc0 tc0 = (tc0) this.o;
                    Paint b = tc0.b();
                    fka fka = (fka) this.X;
                    if (booleanValue) {
                        fka.getText();
                        i = -1;
                    } else {
                        i = fka.getText().e;
                    }
                    b.setColor(i);
                    tc0.c();
                    tc0.invalidateSelf();
                    return;
                }
                return;
            default:
                int intValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                BadgeCountView badgeCountView = (BadgeCountView) this.o;
                if (badgeCountView.getManageVisibility()) {
                    badgeCountView.setVisibility(intValue > 0 ? 0 : 8);
                }
                ag0 ag0 = null;
                if (badgeCountView.getVisibility() != 0) {
                    badgeCountView.setText((CharSequence) null);
                    return;
                } else if (intValue >= 0) {
                    badgeCountView.setText(badgeCountView.getNeedPlusIndicator() ? ((Context) this.X).getString(d2c.folder_new_messages_max_exceeded, new Object[]{Integer.valueOf(intValue)}) : String.valueOf(intValue));
                    int i2 = badgeCountView.y0;
                    GradientDrawable S = intValue < 10 ? hm9.S(Integer.valueOf(i2), (Integer) null, (Integer) null) : hm9.b0(Integer.valueOf(i2), (Integer) null, (Integer) null, tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density));
                    if (1 <= intValue && intValue < 10) {
                        ag0 = new ag0(S, 20, 0.0f, 12);
                    } else if (10 <= intValue && intValue < 100) {
                        ag0 = new ag0(S, 22, 0.0f, 12);
                    } else if (100 <= intValue && intValue < 1000) {
                        ag0 = new ag0(S, 26, 0.0f, 12);
                    } else if (1000 <= intValue && intValue < 10000) {
                        ag0 = new ag0(S, 31, 10.0f, 4);
                    }
                    badgeCountView.setStyle(ag0);
                    return;
                } else {
                    return;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sc0(BadgeCountView badgeCountView, Context context) {
        super(9, (Object) 0);
        this.o = badgeCountView;
        this.X = context;
    }
}
