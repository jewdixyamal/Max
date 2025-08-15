package one.me.profile.screens.addmembers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/profile/screens/addmembers/AddChatMembersScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lk9;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class AddChatMembersScreen extends AbstractPickerScreen<k9> implements ng3 {
    public static final /* synthetic */ bc7[] x0;
    public final fs t0;
    public final fs u0;
    public final glc v0;
    public final q0e w0;

    static {
        Class<AddChatMembersScreen> cls = AddChatMembersScreen.class;
        x0 = new bc7[]{new hob(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), rh4.g(nec.a, cls, "selectedIds", "getSelectedIds()[J")};
    }

    public AddChatMembersScreen(Bundle bundle) {
        super(bundle);
        this.t0 = new fs(Long.class, 0L, "chat_id");
        this.u0 = new fs(long[].class, "selected_ids");
        this.v0 = new glc(new m(2), (k56) null, 6);
        this.w0 = r0e.a(new eqe(yea.d));
        od2.L(new zn5(v0().Z, new l9((Continuation) null, this), 5), getLifecycleScope());
        kr0 kr0 = new kr0((uu3) this, (k56) new x5(3, this));
        if (getRouter() != null) {
            getRouter().a(kr0);
        } else {
            addLifecycleListener(new o9(this, kr0, 0));
        }
    }

    public final bvc getScreenDelegate() {
        return this.v0;
    }

    public final void h(int i, Bundle bundle) {
        if (i != wea.h) {
            k9 k9Var = (k9) v0().c;
            Set set = (Set) v0().Z.a.getValue();
            sx3 sx3 = k9Var.d;
            vxd vxd = null;
            if (sx3 != null) {
                vxd = j47.S(sx3, ((w9a) ((kke) k9Var.c.getValue())).b(), vx3.b, new j9(i, k9Var, set, (Continuation) null));
            }
            k9Var.g.o1(k9Var, k9.i[0], vxd);
        }
    }

    public final Iterable m0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText(((k9) v0().c).h ? yea.c : yea.b);
        oneMeButton.c(1, false);
        oneMeButton.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        layoutParams.setMargins(G, G, G, G);
        oneMeButton.setLayoutParams(layoutParams);
        tu0.K(oneMeButton, 300, new c5(5, (Object) this));
        od2.L(new zn5(v0().Z, new m9(oneMeButton, (Continuation) null), 5), getViewLifecycleScope());
        return Collections.singletonList(oneMeButton);
    }

    public final sya n0() {
        return (tn8) xcb.a.getAccessor().c(tn8.class);
    }

    public final Widget o0(String str) {
        bc7 bc7 = x0[0];
        return new PickerMembersListWidget(str, ((Number) this.t0.a(this)).longValue(), true, (z84) null);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((k9) v0().c).f, getViewLifecycleOwner().Q(), fg7.o), new n9((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final cla p0(Context context) {
        cla cla = new cla(context, 6);
        cla.setId(wea.k);
        cla.setTitle(((k9) v0().c).h ? yea.f : yea.e);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new l(3, this)));
        return cla;
    }

    public final qza q0() {
        bc7 bc7 = x0[0];
        long longValue = ((Number) this.t0.a(this)).longValue();
        xcb xcb = xcb.a;
        return new k9(longValue, xcb.c(), xcb.f());
    }

    public final j0e s0() {
        return this.w0;
    }

    public final Set w0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set n0 = longArray != null ? ys.n0(longArray) : null;
        return n0 == null ? wz4.a : n0;
    }

    public AddChatMembersScreen(long j) {
        this(dy7.g(new kpa("chat_id", Long.valueOf(j))));
    }
}
