package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e8e  reason: default package */
public final /* synthetic */ class e8e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8e b;

    public /* synthetic */ e8e(h8e h8e, int i) {
        this.a = i;
        this.b = h8e;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = this.b.X;
                if (!recyclerView.Z()) {
                    recyclerView.Y();
                    return;
                }
                return;
            default:
                this.b.v0.set(true);
                return;
        }
    }
}
