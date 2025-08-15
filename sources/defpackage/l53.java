package defpackage;

import android.content.Context;
import android.view.View;
import one.me.messages.list.loader.MessageModel;

/* renamed from: l53  reason: default package */
public final class l53 extends ht8 {
    public final /* synthetic */ int T0;
    public final m56 U0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l53(Context context, om8 om8, int i) {
        super(context, new k53(context));
        this.T0 = i;
        switch (i) {
            case 1:
                super(context, new q53(context));
                this.U0 = om8;
                return;
            case 2:
                super(context, new xqd(context));
                this.U0 = om8;
                return;
            case 3:
                super(context, new zqd(context));
                this.U0 = om8;
                return;
            default:
                this.U0 = om8;
                return;
        }
    }

    public final void L(MessageModel messageModel) {
        switch (this.T0) {
            case 0:
                o00 o00 = messageModel.u0.d;
                f53 f53 = o00 instanceof f53 ? (f53) o00 : null;
                if (f53 != null) {
                    k53 k53 = (k53) this.I0;
                    k53.setModel(f53);
                    k53.setOnFinalImageSetCallback(new lr1(this, f53, messageModel, 2));
                    return;
                }
                return;
            case 1:
                o00 o002 = messageModel.u0.d;
                f53 f532 = o002 instanceof f53 ? (f53) o002 : null;
                if (f532 != null) {
                    q53 q53 = (q53) this.I0;
                    q53.setModel(f532);
                    q53.setOnFinalImageSetCallback(new lr1(this, f532, messageModel, 3));
                    return;
                }
                return;
            case 2:
                o00 o003 = messageModel.u0.d;
                vqd vqd = o003 instanceof vqd ? (vqd) o003 : null;
                if (vqd != null) {
                    View view = this.I0;
                    ((xqd) view).setModel(vqd);
                    ((xqd) view).x0.setOnFinalImageSetCallback(new a81(this, vqd, messageModel, 10));
                    return;
                }
                return;
            default:
                o00 o004 = messageModel.u0.d;
                vqd vqd2 = o004 instanceof vqd ? (vqd) o004 : null;
                if (vqd2 != null) {
                    zqd zqd = (zqd) this.I0;
                    zqd.setModel(vqd2);
                    zqd.D0.setOnFinalImageSetCallback(new a81(this, vqd2, messageModel, 11));
                    return;
                }
                return;
        }
    }

    public void M(is0 is0) {
        switch (this.T0) {
            case 1:
                ((q53) this.I0).x(is0);
                return;
            case 3:
                ((zqd) this.I0).x(is0);
                return;
            default:
                return;
        }
    }

    public final void O(v83 v83) {
        switch (this.T0) {
            case 0:
                k53 k53 = (k53) this.I0;
                k53.setDateTextColor(v83.g.a);
                k53.w0.f();
                return;
            case 1:
                ((q53) this.I0).C0.f();
                return;
            case 2:
                ((xqd) this.I0).setDateTextColor(v83.g.a);
                return;
            default:
                zqd zqd = (zqd) this.I0;
                if (!zqd.w()) {
                    zqd.getDate$message_list_release().setTextColor$message_list_release(v83.g.a);
                    return;
                }
                return;
        }
    }
}
