package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: ri2  reason: default package */
public final class ri2 implements k56 {
    public final /* synthetic */ ChatMediaViewerScreen a;
    public final /* synthetic */ int b;
    public final /* synthetic */ cj2 c;

    public ri2(ChatMediaViewerScreen chatMediaViewerScreen, int i, cj2 cj2) {
        this.a = chatMediaViewerScreen;
        this.b = i;
        this.c = cj2;
    }

    public final Object invoke() {
        String name = this.a.getClass().getName();
        cj2 cj2 = this.c;
        int i = this.b;
        ChatMediaViewerScreen chatMediaViewerScreen = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            int i2 = cj2.b;
            int j = chatMediaViewerScreen.D0.j();
            int size = cj2.a.size();
            StringBuilder j2 = wg0.j("Media viewer. Pager, after submitList \n                        |initPos:", i2, ", \n                        |prevItemsA:", i, ", \n                        |itemsA:");
            j2.append(j);
            j2.append(", \n                        |items:");
            j2.append(size);
            ir6.d(us7, name, x9e.c0(j2.toString()), (Throwable) null);
        }
        if (this.b == 0 && (!this.c.a.isEmpty()) && this.c.b >= 0) {
            ChatMediaViewerScreen chatMediaViewerScreen2 = this.a;
            chatMediaViewerScreen2.getClass();
            ((ViewPager2) chatMediaViewerScreen2.x0.T0(chatMediaViewerScreen2, ChatMediaViewerScreen.K0[5])).e(this.c.b, false);
        }
        return e5f.a;
    }
}
