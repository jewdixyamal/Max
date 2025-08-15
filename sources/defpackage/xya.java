package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: xya  reason: default package */
public final /* synthetic */ class xya implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ xya(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Y();
                return;
            case 1:
                this.b.Y();
                return;
            default:
                this.b.Y();
                return;
        }
    }
}
