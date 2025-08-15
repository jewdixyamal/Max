package defpackage;

import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: ad2  reason: default package */
public final /* synthetic */ class ad2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ad2(s3e s3e, m6e m6e) {
        this.a = 7;
        this.c = s3e;
        this.b = m6e;
    }

    public final boolean onLongClick(View view) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                ((m56) obj2).invoke((vm8) obj);
                return true;
            case 1:
                ((a66) obj2).invoke(Long.valueOf(((nn3) obj).a), view);
                return true;
            case 2:
                z2e z2e = ((jw7) obj2).H0;
                if (z2e != null) {
                    ((w2e) obj).g(z2e);
                }
                return true;
            case 3:
                ((a66) obj2).invoke(Long.valueOf(((kn8) obj).a), view);
                return true;
            case 4:
                ht8 ht8 = (ht8) obj;
                long j = ht8.J0;
                bc7[] bc7Arr = MessagesListWidget.X0;
                ((b69) ((xs8) obj2)).a.z0(j, ht8.I0);
                return true;
            case 5:
                gza gza = ((pxa) obj).s0;
                return ((Boolean) ((a66) obj2).invoke(Long.valueOf(gza.a), gza.b)).booleanValue();
            case 6:
                z2e z2e2 = ((jw7) obj2).H0;
                if (z2e2 != null) {
                    ((w2e) obj).g(z2e2);
                }
                return true;
            case 7:
                y0d y0d = ((s3e) obj).J0;
                if (y0d != null) {
                    ((m56) obj2).invoke(y0d);
                }
                return true;
            default:
                z2e z2e3 = ((jw7) obj2).H0;
                if (z2e3 != null) {
                    ((w2e) obj).g(z2e3);
                }
                return true;
        }
    }

    public /* synthetic */ ad2(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
