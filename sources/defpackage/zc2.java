package defpackage;

import android.view.View;

/* renamed from: zc2  reason: default package */
public final /* synthetic */ class zc2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a66 b;
    public final /* synthetic */ vm8 c;
    public final /* synthetic */ bd2 o;

    public /* synthetic */ zc2(a66 a66, vm8 vm8, bd2 bd2, int i) {
        this.a = i;
        this.b = a66;
        this.c = vm8;
        this.o = bd2;
    }

    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c, this.o.a);
                return true;
            default:
                this.b.invoke(this.c, this.o.a);
                return true;
        }
    }
}
