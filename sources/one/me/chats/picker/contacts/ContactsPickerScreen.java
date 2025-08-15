package one.me.chats.picker.contacts;

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
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chats/picker/contacts/ContactsPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Las3;", "Lvm9;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "requestCode", "(I)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ContactsPickerScreen extends AbstractPickerScreen<as3> implements vm9 {
    public static final /* synthetic */ bc7[] v0;
    public final fs t0;
    public final x3c u0;

    static {
        hob hob = new hob(ContactsPickerScreen.class, "requestCode", "getRequestCode()I", 0);
        nec.a.getClass();
        v0 = new bc7[]{hob};
    }

    public ContactsPickerScreen(Bundle bundle) {
        super(bundle);
        this.t0 = new fs(Integer.class, 0, "contacts.picker.request_code.key");
        kr0 kr0 = new kr0((uu3) this, (k56) new md1(28, this));
        if (getRouter() != null) {
            getRouter().a(kr0);
        } else {
            addLifecycleListener(new o9(this, kr0, 1));
        }
        ys2 ys2 = ys2.a;
        this.u0 = new x3c((je7) ys2.getAccessor().d(q33.class), (je7) ys2.getAccessor().d(kke.class), (je7) null, 12);
    }

    public final Iterable m0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText(r8a.I);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        layoutParams.setMargins(G, G, G, G);
        oneMeButton.setLayoutParams(layoutParams);
        tu0.K(oneMeButton, 300, new c5(23, (Object) this));
        od2.L(new zn5(v0().Z, new vr3(oneMeButton, (Continuation) null), 5), getViewLifecycleScope());
        return Collections.singletonList(oneMeButton);
    }

    public final sya n0() {
        return new va8(ys2.a.getAccessor().d(qn3.class), this.u0, false, 13);
    }

    public final wuc o() {
        return wuc.CHAT_SHARE_CONTACT;
    }

    public final Widget o0(String str) {
        return new PickerContactsListWidget(str, (z84) null);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        v3c.y(new xr3(3, (Continuation) null, 0), view);
        od2.L(new zn5(tu0.g(((as3) v0().c).g, getViewLifecycleOwner().Q(), fg7.o), new wr3((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final cla p0(Context context) {
        cla cla = new cla(context, 6);
        cla.setId(p8a.Z);
        cla.setTitle(r8a.J);
        cla.setForm(uka.a);
        cla.setLeftActions(new lka(new jy2(5, this)));
        return cla;
    }

    public final qza q0() {
        ys2 ys2 = ys2.a;
        return new as3(ys2.getAccessor().d(qn3.class), ys2.getAccessor().d(kke.class), this.u0);
    }

    public final j0e s0() {
        return r0e.a(new eqe(r8a.H));
    }

    public final Set w0(Bundle bundle) {
        return wz4.a;
    }

    public ContactsPickerScreen(int i) {
        this(dy7.g(new kpa("contacts.picker.request_code.key", Integer.valueOf(i))));
    }
}
