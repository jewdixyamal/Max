package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: t59  reason: default package */
public final class t59 extends tdc {
    public final int a = tu0.G(((float) 80) * fk4.d().getDisplayMetrics().density);
    public Boolean b;
    public boolean c;
    public final /* synthetic */ MessagesListWidget d;

    public t59(MessagesListWidget messagesListWidget) {
        this.d = messagesListWidget;
    }

    public final void a(RecyclerView recyclerView, int i) {
        this.c = i != 0;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        hdc adapter;
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
        int computeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
        int height = recyclerView.getHeight();
        int i3 = this.a;
        if (computeVerticalScrollRange >= height + i3) {
            LinearLayoutManager t = z7.t(recyclerView);
            MessagesListWidget messagesListWidget = this.d;
            if (!(t == null || (adapter = recyclerView.getAdapter()) == null)) {
                int j = adapter.j();
                Integer valueOf = Integer.valueOf(j);
                if (j <= 0) {
                    valueOf = null;
                }
                if (!(valueOf == null || t.r(valueOf.intValue() - 1) == null || computeVerticalScrollRange - (computeVerticalScrollOffset + computeVerticalScrollExtent) >= i3)) {
                    Boolean bool = this.b;
                    if (bool == null || tpa.f(bool, Boolean.TRUE)) {
                        bc7[] bc7Arr = MessagesListWidget.X0;
                        messagesListWidget.x0().L(false);
                        this.b = Boolean.FALSE;
                        return;
                    }
                    return;
                }
            }
            Boolean bool2 = this.b;
            if (bool2 == null || tpa.f(bool2, Boolean.FALSE)) {
                bc7[] bc7Arr2 = MessagesListWidget.X0;
                messagesListWidget.x0().L(true);
                this.b = Boolean.TRUE;
            }
        }
    }
}
