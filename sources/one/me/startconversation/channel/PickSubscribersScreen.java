package one.me.startconversation.channel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/startconversation/channel/PickSubscribersScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lxwa;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PickSubscribersScreen extends AbstractPickerScreen<xwa> {
    public static final /* synthetic */ bc7[] z0;
    public final fs t0;
    public final fs u0;
    public final khe v0;
    public vha w0;
    public final q0e x0;
    public final qm0 y0;

    static {
        Class<PickSubscribersScreen> cls = PickSubscribersScreen.class;
        z0 = new bc7[]{new oi9(cls, "selectedIds", "getSelectedIds()[J"), z7b.g(nec.a, cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), new hob(cls, "confirmButton", "getConfirmButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public PickSubscribersScreen(Bundle bundle) {
        super(bundle);
        this.t0 = new fs(long[].class, "selected_ids");
        this.u0 = new fs(Long.class, "id");
        this.v0 = new khe(new s4a(14));
        this.x0 = r0e.a(new eqe(aja.w));
        this.y0 = binding(new exa(this, 0));
        od2.L(new zn5(v0().Z, new gxa(this, (Continuation) null), 5), getLifecycleScope());
        kr0 kr0 = new kr0((uu3) this, (k56) new exa(this, 1));
        if (getRouter() != null) {
            getRouter().a(kr0);
        } else {
            addLifecycleListener(new o9(this, kr0, 11));
        }
    }

    public final Iterable m0() {
        od2.L(new zn5(v0().Z, new ixa(this, (Continuation) null), 5), getViewLifecycleScope());
        return Collections.singletonList(x0());
    }

    public final sya n0() {
        return (tn8) nyd.a.getAccessor().c(tn8.class);
    }

    public final Widget o0(String str) {
        return new PickerMembersListWidget(str, 0, false, 6, (z84) null);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(((xwa) v0().c).h, new jxa(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final cla p0(Context context) {
        cla cla = new cla(context, 6);
        cla.setId(zia.p);
        cla.setTitle(aja.e);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new fxa(this, 0)));
        return cla;
    }

    public final qza q0() {
        bc7 bc7 = z0[1];
        long longValue = ((Number) this.u0.a(this)).longValue();
        nyd nyd = nyd.a;
        return new xwa(longValue, nyd.getAccessor().d(pk.class), nyd.getAccessor().d(kke.class), nyd.getAccessor().d(iy2.class), nyd.getAccessor().d(dxa.class), nyd.getAccessor().d(gh3.class));
    }

    public final j0e s0() {
        return this.x0;
    }

    public final Set w0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set n0 = longArray != null ? ys.n0(longArray) : null;
        return n0 == null ? wz4.a : n0;
    }

    public final OneMeButton x0() {
        bc7 bc7 = z0[2];
        return (OneMeButton) this.y0.getValue();
    }

    public PickSubscribersScreen(long j) {
        this(dy7.g(new kpa("id", Long.valueOf(j))));
    }
}
