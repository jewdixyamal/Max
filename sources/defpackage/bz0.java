package defpackage;

import android.view.View;

/* renamed from: bz0  reason: default package */
public final /* synthetic */ class bz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ bz0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ufd ufd = (ufd) ((cz0) this.b).a;
                je7 je7 = ufd.P0;
                boolean z = !(!je7.a() ? false : ((tja) je7.getValue()).isChecked());
                ufd.setEndView(new ffd(z, true));
                ((wmc) this.c).q(((e01) ((ol7) this.o)).o, z);
                return;
            case 1:
                fb5 fb5 = (fb5) this.b;
                long j = fb5.a;
                if (fb5.Z) {
                    ((m56) this.c).invoke(Long.valueOf(j));
                    return;
                } else {
                    ((m56) this.o).invoke(Long.valueOf(j));
                    return;
                }
            default:
                ela.d((ela) this.b, (m56) this.c, (zka) this.o);
                return;
        }
    }
}
