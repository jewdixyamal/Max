package defpackage;

import android.view.View;
import java.util.Set;

/* renamed from: gl9  reason: default package */
public final /* synthetic */ class gl9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ il9 b;

    public /* synthetic */ gl9(il9 il9, int i) {
        this.a = i;
        this.b = il9;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                for (el9 n : (Set) this.b.a) {
                    n.n(new fj0(5));
                }
                return;
            default:
                for (el9 n2 : (Set) this.b.a) {
                    n2.n(new fj0(4));
                }
                return;
        }
    }
}
