package defpackage;

import android.view.View;

/* renamed from: fr3  reason: default package */
public final /* synthetic */ class fr3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yq3 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ dec o;

    public /* synthetic */ fr3(dec dec, yq3 yq3, boolean z, int i) {
        this.a = i;
        this.o = dec;
        this.b = yq3;
        this.c = z;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                gr3 gr3 = (gr3) this.o;
                wq3 wq3 = gr3.F0;
                int i = this.b.a;
                wq3.w(i);
                gr3.G0.a(f46.c0(i), 1, this.c ? 1 : 2);
                return;
            default:
                sr3 sr3 = (sr3) this.o;
                wq3 wq32 = sr3.F0;
                int i2 = this.b.a;
                wq32.w(i2);
                sr3.G0.a(f46.c0(i2), 2, this.c ? 1 : 2);
                return;
        }
    }
}
