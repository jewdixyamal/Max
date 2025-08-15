package one.me.notifications.settings.screens.chat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/notifications/settings/screens/chat/ChatNotificationsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "notifications-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatNotificationsSettingsScreen extends Widget {
    public static final /* synthetic */ bc7[] Y;
    public final qm0 X = binding(new fm2(this, 1));
    public final x27 a = x27.d;
    public final je7 b = createViewModelLazy(im2.class, new ti2(5, new m52(21)));
    public final mfd c = new mfd(new gd1(2, this), sw9.a.getExecutors().a());
    public final qm0 o = binding(new fm2(this, 0));

    static {
        Class<ChatNotificationsSettingsScreen> cls = ChatNotificationsSettingsScreen.class;
        Y = new bc7[]{new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.e(nec.a, cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    }

    public ChatNotificationsSettingsScreen() {
        super((Bundle) null, 0, 3, (z84) null);
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(dea.b);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        float f = (float) 12;
        linearLayout.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
        bc7[] bc7Arr = Y;
        bc7 bc7 = bc7Arr[0];
        linearLayout.addView((cla) this.o.getValue());
        bc7 bc72 = bc7Arr[1];
        linearLayout.addView((EndlessRecyclerView2) this.X.getValue());
        v3c.y(new o(3, (Continuation) null, 1), linearLayout);
        return linearLayout;
    }

    public final void onViewCreated(View view) {
        od2.L(new zn5(tu0.g(((im2) this.b.getValue()).X, getViewLifecycleOwner().Q(), fg7.o), new hm2((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
