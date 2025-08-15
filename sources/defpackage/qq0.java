package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import java.util.List;
import one.me.chatscreen.ChatScreen;
import one.me.profile.ProfileScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import ru.ok.tamtam.nano.Protos;

/* renamed from: qq0  reason: default package */
public final class qq0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ugf b2;
        Object value;
        int i9 = 0;
        ViewGroup viewGroup = null;
        switch (this.a) {
            case 0:
                ((BottomAppBar$Behavior) this.b).getClass();
                throw null;
            case 1:
                view.removeOnLayoutChangeListener(this);
                dm1 dm1 = (dm1) this.b;
                dm1.A(dm1.Q0);
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                ap1 ap1 = (ap1) this.b;
                ap1.K(ap1.f1);
                return;
            case 3:
                ip1 ip1 = (ip1) this.b;
                if (ip1.c != null && (b2 = ip1.getVideoLayoutUpdatesController()) != null) {
                    b2.a(ip1, ip1.v0);
                    return;
                }
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                bc7[] bc7Arr = ChatScreen.k1;
                ChatScreen chatScreen = (ChatScreen) this.b;
                if (qqe.c(chatScreen.N0().getTitle())) {
                    ChatScreen.w0(chatScreen, chatScreen.N0(), true);
                    return;
                }
                return;
            case 5:
                view.removeOnLayoutChangeListener(this);
                dw8 dw8 = (dw8) this.b;
                ViewGroup viewGroup2 = (ViewGroup) dw8.b;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                int q = rh4.q((float) 10, fk4.d().getDisplayMetrics().density, viewGroup2.getMeasuredWidth()) - dw8.L();
                if (q >= 0) {
                    i9 = q;
                }
                ViewGroup viewGroup3 = (ViewGroup) dw8.b;
                if (viewGroup3 != null) {
                    viewGroup = viewGroup3;
                }
                f46.D(i9, dw8.Q(), viewGroup);
                return;
            case 6:
                view.removeOnLayoutChangeListener(this);
                String str = ((m89) this.b).f;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, str, ey8.h(((m89) this.b).b.c, "Scroll: Highlighted from args message with id="), (Throwable) null);
                }
                m89 m89 = (m89) this.b;
                g39 g39 = m89.e;
                long j = m89.b.c;
                List list = ((m89) this.b).b.d;
                q0e q0e = g39.o;
                do {
                    value = q0e.getValue();
                    jk6 jk6 = (jk6) value;
                } while (!q0e.c(value, new jk6(j, list)));
                return;
            case 7:
                view.removeOnLayoutChangeListener(this);
                g9a g9a = (g9a) this.b;
                g9a.getEditText().getHitRect(g9a.A0);
                Rect rect = g9a.B0;
                rect.set(g9a.A0);
                rect.left = rect.right;
                rect.right = g9a.getRight();
                return;
            case 8:
                view.removeOnLayoutChangeListener(this);
                ((eha) this.b).G0.start();
                return;
            case 9:
                cla.e((cla) this.b);
                return;
            case 10:
                view.removeOnLayoutChangeListener(this);
                bc7[] bc7Arr2 = ProfileScreen.D0;
                ProfileScreen profileScreen = (ProfileScreen) this.b;
                if (qqe.c(profileScreen.p0().getTitle())) {
                    ProfileScreen.m0(profileScreen, profileScreen.p0(), true);
                    return;
                }
                return;
            case 11:
                view.removeOnLayoutChangeListener(this);
                ((k56) this.b).invoke();
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((o0d) this.b).adjustDropDownSizeAndPosition();
                return;
            case 13:
                uwe uwe = (uwe) this.b;
                uwe.getClass();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                uwe.V0 = iArr[0];
                view.getWindowVisibleDisplayFrame(uwe.O0);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                view.removeOnLayoutChangeListener(this);
                ((lsf) this.b).f();
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                bc7[] bc7Arr3 = WebAppRootScreen.G0;
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.b;
                if (qqe.c(webAppRootScreen.y0().getTitle())) {
                    WebAppRootScreen.D0(webAppRootScreen.y0(), true);
                    return;
                }
                return;
        }
    }
}
