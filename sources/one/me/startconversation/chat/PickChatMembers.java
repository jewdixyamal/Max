package one.me.startconversation.chat;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/startconversation/chat/PickChatMembers;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lqwa;", "<init>", "()V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PickChatMembers extends AbstractPickerScreen<qwa> {
    public static final /* synthetic */ bc7[] x0;
    public final fs t0 = new fs(long[].class, "selected_ids");
    public final je7 u0 = nyd.a.getAccessor().d(eua.class);
    public final glc v0 = new glc(new s4a(13), (k56) null, 6);
    public final q0e w0 = r0e.a(new eqe(aja.w));

    static {
        oi9 oi9 = new oi9(PickChatMembers.class, "selectedIds", "getSelectedIds()[J");
        nec.a.getClass();
        x0 = new bc7[]{oi9};
    }

    public PickChatMembers() {
        super(new Bundle(0));
        od2.L(new zn5(v0().Z, new mwa((Continuation) null, this), 5), getLifecycleScope());
        kr0 kr0 = new kr0((uu3) this, (k56) new lwa(0, this));
        if (getRouter() != null) {
            getRouter().a(kr0);
        } else {
            addLifecycleListener(new o9(this, kr0, 10));
        }
    }

    public final bvc getScreenDelegate() {
        return this.v0;
    }

    public final Iterable m0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText(r8a.Q);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        layoutParams.setMargins(G, G, G, G);
        oneMeButton.setLayoutParams(layoutParams);
        tu0.K(oneMeButton, 300, new xx5(25, this));
        od2.L(new zn5(v0().Z, new nwa(oneMeButton, (Continuation) null), 5), getViewLifecycleScope());
        return Collections.singletonList(oneMeButton);
    }

    public final sya n0() {
        return (tn8) nyd.a.getAccessor().c(tn8.class);
    }

    public final Widget o0(String str) {
        return new PickerMembersListWidget(str, 0, false, 6, (z84) null);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            l5g l5g = new l5g(this, 1);
            String[] strArr2 = eua.e;
            int i2 = jpc.Q1;
            int i3 = jpc.W1;
            ((eua) this.u0.getValue()).getClass();
            eua.k(l5g, strArr, iArr, strArr2, i2, i3);
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((qwa) v0().c).e, getViewLifecycleOwner().Q(), fg7.o), new owa((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final cla p0(Context context) {
        cla cla = new cla(context, 6);
        cla.setId(zia.k);
        cla.setTitle(aja.g);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new wz7(15, this)));
        return cla;
    }

    public final qza q0() {
        return new qwa();
    }

    public final j0e s0() {
        return this.w0;
    }

    public final Set w0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set n0 = longArray != null ? ys.n0(longArray) : null;
        return n0 == null ? wz4.a : n0;
    }
}
