package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.login.inputname.InputNameScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.arch.Widget;
import one.me.startconversation.StartConversationScreen;

/* renamed from: ru3  reason: default package */
public final class ru3 extends a3a {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ru3(int i, Object obj) {
        super(false);
        this.d = i;
        this.e = obj;
    }

    public void a() {
        switch (this.d) {
            case 5:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                c cVar = (c) this.e;
                if (isLoggable) {
                    Objects.toString(cVar);
                }
                he0 he0 = cVar.h;
                if (he0 != null) {
                    he0.r = false;
                    dd4 dd4 = new dd4(27, cVar);
                    if (he0.p == null) {
                        he0.p = new ArrayList();
                    }
                    he0.p.add(dd4);
                    cVar.h.d(false);
                    cVar.A(true);
                    cVar.F();
                }
                cVar.h = null;
                return;
            default:
                return;
        }
    }

    public final void b() {
        q0e q0e;
        Object value;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                uu3 uu3 = (uu3) obj;
                if (!uu3.router.i().m()) {
                    f(false);
                    uu3.getOnBackPressedDispatcher().d();
                    if (!uu3.isBeingDestroyed) {
                        f(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                crd crd = CallIncomingScreen.Z;
                e91 m0 = ((CallIncomingScreen) obj).m0();
                do {
                    q0e = m0.t0;
                    value = q0e.getValue();
                    c91 c91 = (c91) value;
                } while (!q0e.c(value, new b91(false)));
                return;
            case 2:
                ((l91) obj).h();
                return;
            case 3:
                yxc yxc = CallScreen.R0;
                ((CallScreen) obj).s0(false);
                return;
            case 4:
                bc7[] bc7Arr = ChatMembersScreen.u0;
                ChatMembersScreen chatMembersScreen = (ChatMembersScreen) obj;
                if (chatMembersScreen.o0().r()) {
                    chatMembersScreen.o0().q();
                    return;
                } else {
                    chatMembersScreen.getRouter().C();
                    return;
                }
            case 5:
                c cVar = (c) obj;
                if (Log.isLoggable("FragmentManager", 3)) {
                    Objects.toString(cVar);
                }
                cVar.A(true);
                he0 he0 = cVar.h;
                ru3 ru3 = cVar.i;
                if (he0 != null) {
                    ArrayList arrayList = cVar.n;
                    if (!arrayList.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(c.G(cVar.h));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            au1.r(it.next());
                            Iterator it2 = linkedHashSet.iterator();
                            if (it2.hasNext()) {
                                a aVar = (a) it2.next();
                                throw null;
                            }
                        }
                    }
                    Iterator it3 = cVar.h.a.iterator();
                    while (it3.hasNext()) {
                        a aVar2 = ((v16) it3.next()).b;
                        if (aVar2 != null) {
                            aVar2.y0 = false;
                        }
                    }
                    Iterator it4 = cVar.f(new ArrayList(Collections.singletonList(cVar.h)), 0, 1).iterator();
                    while (it4.hasNext()) {
                        yd4 yd4 = (yd4) it4.next();
                        ArrayList arrayList2 = yd4.c;
                        yd4.j(arrayList2);
                        yd4.c(arrayList2);
                    }
                    Iterator it5 = cVar.h.a.iterator();
                    while (it5.hasNext()) {
                        a aVar3 = ((v16) it5.next()).b;
                        if (aVar3 != null && aVar3.T0 == null) {
                            cVar.g(aVar3).k();
                        }
                    }
                    cVar.h = null;
                    cVar.l0();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        boolean z = ru3.a;
                        cVar.toString();
                        return;
                    }
                    return;
                } else if (ru3.a) {
                    cVar.T();
                    return;
                } else {
                    cVar.g.d();
                    return;
                }
            case 6:
                bc7[] bc7Arr2 = InputNameScreen.B0;
                ((InputNameScreen) obj).r0();
                return;
            case 7:
                ((m56) obj).invoke(this);
                return;
            case 8:
                bc7[] bc7Arr3 = ProfileEditAdminPermissionsWidget.x0;
                ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = (ProfileEditAdminPermissionsWidget) obj;
                int ordinal = profileEditAdminPermissionsWidget.n0().ordinal();
                if (ordinal == 0) {
                    profileEditAdminPermissionsWidget.getRouter().C();
                    return;
                } else if (ordinal == 1) {
                    profileEditAdminPermissionsWidget.o0().x();
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            case 9:
                ((hzc) obj).q();
                return;
            default:
                bc7[] bc7Arr4 = StartConversationScreen.I0;
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj;
                startConversationScreen.getClass();
                eha searchView = ((cla) startConversationScreen.v0.T0(startConversationScreen, StartConversationScreen.I0[4])).getSearchView();
                if (searchView != null) {
                    searchView.b();
                    return;
                }
                return;
        }
    }

    public void c(ge0 ge0) {
        switch (this.d) {
            case 5:
                boolean isLoggable = Log.isLoggable("FragmentManager", 2);
                c cVar = (c) this.e;
                if (isLoggable) {
                    Objects.toString(cVar);
                }
                if (cVar.h != null) {
                    Iterator it = cVar.f(new ArrayList(Collections.singletonList(cVar.h)), 0, 1).iterator();
                    while (it.hasNext()) {
                        ArrayList arrayList = ((yd4) it.next()).c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            d63.V(((ovd) it2.next()).k, arrayList2);
                        }
                        List D0 = x53.D0(x53.H0(arrayList2));
                        int size = D0.size();
                        for (int i = 0; i < size; i++) {
                            ((nvd) D0.get(i)).c(ge0);
                        }
                    }
                    Iterator it3 = cVar.n.iterator();
                    if (it3.hasNext()) {
                        au1.r(it3.next());
                        throw null;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void d() {
        switch (this.d) {
            case 5:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                c cVar = (c) this.e;
                if (isLoggable) {
                    Objects.toString(cVar);
                }
                cVar.x();
                cVar.y(new m16(cVar), false);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ru3(Widget widget, int i) {
        super(true);
        this.d = i;
        this.e = widget;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ru3(StartConversationScreen startConversationScreen, boolean z) {
        super(z);
        this.d = 10;
        this.e = startConversationScreen;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ru3(boolean z, m56 m56) {
        super(z);
        this.d = 7;
        this.e = m56;
    }
}
