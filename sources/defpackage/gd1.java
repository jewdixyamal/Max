package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.contactlist.ContactListWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: gd1  reason: default package */
public final class gd1 implements b66, t15, lfd, fn3, erd, ab3, bha, b38 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gd1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void e() {
    }

    public void I(CharSequence charSequence) {
        bc7[] bc7Arr = ContactListWidget.P0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        contactListWidget.getClass();
        bc7[] bc7Arr2 = ContactListWidget.P0;
        bc7 bc7 = bc7Arr2[7];
        contactListWidget.M0.b(contactListWidget, Boolean.TRUE);
        bc7 bc72 = bc7Arr2[5];
        contactListWidget.K0.b(contactListWidget, charSequence);
        if (contactListWidget.q0()) {
            oo3 p0 = contactListWidget.p0();
            String obj = charSequence != null ? charSequence.toString() : null;
            if (obj == null) {
                obj = "";
            }
            ((ti9) p0.B0.g.getValue()).setValue(obj);
        }
    }

    public void U() {
        ((yo3) ((ContactListWidget) this.b).y0.getValue()).f(false);
    }

    public void X(long j, boolean z) {
        Object obj = this.b;
        switch (this.a) {
            case 2:
                bc7[] bc7Arr = ChatNotificationsSettingsScreen.Y;
                ((im2) ((ChatNotificationsSettingsScreen) obj).b.getValue()).s(j);
                return;
            case 8:
                bc7[] bc7Arr2 = DialogNotificationsSettingsScreen.Y;
                ((pj4) ((DialogNotificationsSettingsScreen) obj).b.getValue()).r(j);
                return;
            case 16:
                bc7[] bc7Arr3 = MessagesSettingsScreen.Y;
                u89 u89 = (u89) ((MessagesSettingsScreen) obj).c.getValue();
                if (j == Long.MAX_VALUE) {
                    ((jp) u89.b).j("app.messages.send.by.enter", z);
                    return;
                } else {
                    u89.getClass();
                    return;
                }
            case LangUtils.HASH_SEED /*17*/:
                bc7[] bc7Arr4 = NotificationsSettingsScreen.v0;
                ((NotificationsSettingsScreen) obj).m0().s(j);
                return;
            default:
                bc7[] bc7Arr5 = OtherNotificationsSettingsScreen.Y;
                ((ina) ((OtherNotificationsSettingsScreen) obj).b.getValue()).r(j);
                return;
        }
    }

    public void a(Object obj) {
        switch (this.a) {
            case 4:
                ((ab3) this.b).b();
                return;
            default:
                ((b38) ((g28) this.b).b).a(obj);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [i20, java.lang.Object] */
    public Object apply(Object obj) {
        i20 i20;
        switch (this.a) {
            case 0:
                return new sa3(2, new uh((ed1) obj, 3, (String) this.b));
            case 7:
                hy8 a2 = ((iy8) ((mec) this.b).a).a();
                String str = ((kef) obj).d;
                a2.c = pag.u(str);
                a2.b = str;
                return a2.a();
            case 9:
                tp4 tp4 = (tp4) obj;
                lp4 lp4 = (lp4) this.b;
                ep4 ep4 = lp4.a;
                fp4 fp4 = new fp4(ep4.a, ep4.b);
                ref ref = lp4.e;
                if (ref == null) {
                    i20 = null;
                } else {
                    ? obj2 = new Object();
                    obj2.c = ref.c;
                    obj2.b = ref.b;
                    obj2.a = ref.a;
                    obj2.d = ref.d;
                    i20 = obj2;
                }
                return new sa3(2, new uh(tp4, 5, new np4(fp4, lp4.b, lp4.c, lp4.d, i20)));
            case 10:
                ep4 ep42 = (ep4) this.b;
                return new sa3(2, new rp4((Object) (tp4) obj, ep42.a, ep42.b, 0));
            case 11:
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 3) {
                    return ((d66) this.b).apply(objArr[0], objArr[1], objArr[2]);
                }
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return ((Class) this.b).cast(obj);
            case 13:
                List list = (List) obj;
                Collections.sort(list, (Comparator) this.b);
                return list;
            case 19:
                List<h9c> list2 = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (h9c h9c : list2) {
                    Long l = null;
                    j3e j3e = h9c instanceof j3e ? (j3e) h9c : null;
                    if (j3e != null) {
                        l = Long.valueOf(j3e.c);
                    }
                    if (l != null) {
                        arrayList.add(l);
                    }
                }
                if (arrayList.isEmpty()) {
                    return wa3.a;
                }
                x9c x9c = (x9c) this.b;
                return new qa3(x9c.b().c(list2), 0, new sa3(1, new u9c(x9c, arrayList, 1)));
            case 20:
                Object apply = ((b66) ((ib3) this.b).c).apply(new Object[]{obj});
                Objects.requireNonNull(apply, "The zipper returned a null value");
                return apply;
            case 21:
                return qi8.m((qi8) this.b, (fk2) obj, "@");
            case 22:
                Boolean bool = (Boolean) obj;
                return ((v7g) this.b).h();
            case 23:
                ((Number) obj).longValue();
                vk8 vk8 = (vk8) this.b;
                vk8.getClass();
                return new q1a(1, new bqc(12, vk8)).m(ce.a());
            default:
                return ((aab) this.b).p((n1e) obj);
        }
    }

    public void b() {
        switch (this.a) {
            case 5:
                r8g r8g = (r8g) this.b;
                ((hc3) r8g.c).g();
                ((ab3) r8g.o).b();
                return;
            default:
                ((b38) ((g28) this.b).b).b();
                return;
        }
    }

    public void c(zl4 zl4) {
        switch (this.a) {
            case 4:
                ((ab3) this.b).c(zl4);
                return;
            case 5:
                ((hc3) ((r8g) this.b).c).a(zl4);
                return;
            default:
                dm4.e((g28) this.b, zl4);
                return;
        }
    }

    public void g() {
        bc7[] bc7Arr = ContactListWidget.P0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        contactListWidget.getClass();
        bc7 bc7 = ContactListWidget.P0[6];
        Boolean bool = Boolean.TRUE;
        contactListWidget.L0.b(contactListWidget, bool);
        ((bh0) contactListWidget.A0.getValue()).Y.m((Object) null, bool);
        an9.g((an9) contactListWidget.b.getValue(), wuc.CONTACTS_SEARCH);
    }

    public boolean h() {
        switch (this.a) {
            case 1:
                return false;
            default:
                bc7[] bc7Arr = MessagesListWidget.X0;
                return ((l29) ((MessagesListWidget) this.b).x0().p1.getValue()).c;
        }
    }

    public void i(long j) {
        Object obj = this.b;
        switch (this.a) {
            case 2:
                bc7[] bc7Arr = ChatNotificationsSettingsScreen.Y;
                ((im2) ((ChatNotificationsSettingsScreen) obj).b.getValue()).s(j);
                return;
            case 8:
                bc7[] bc7Arr2 = DialogNotificationsSettingsScreen.Y;
                ((pj4) ((DialogNotificationsSettingsScreen) obj).b.getValue()).r(j);
                return;
            case 16:
                bc7[] bc7Arr3 = MessagesSettingsScreen.Y;
                u89 u89 = (u89) ((MessagesSettingsScreen) obj).c.getValue();
                if (j == Long.MAX_VALUE) {
                    jp jpVar = (jp) u89.b;
                    jpVar.j("app.messages.send.by.enter", !jpVar.g.getBoolean("app.messages.send.by.enter", false));
                    u89.q();
                    return;
                }
                u89.getClass();
                if (j == 9223372036854775806L) {
                    s89.c.getClass();
                    pnf.o(u89.X, new c64(":stickers/settings"));
                    return;
                }
                return;
            case LangUtils.HASH_SEED /*17*/:
                bc7[] bc7Arr4 = NotificationsSettingsScreen.v0;
                ((NotificationsSettingsScreen) obj).m0().s(j);
                return;
            default:
                bc7[] bc7Arr5 = OtherNotificationsSettingsScreen.Y;
                ((ina) ((OtherNotificationsSettingsScreen) obj).b.getValue()).r(j);
                return;
        }
    }

    public void j() {
        switch (this.a) {
            case 1:
                return;
            default:
                bc7[] bc7Arr = MessagesListWidget.X0;
                ((bx) ((MessagesListWidget) this.b).x0().o).y();
                return;
        }
    }

    public void l() {
        gi2 gi2;
        tf2 x;
        switch (this.a) {
            case 1:
                if ((!((lh2) ((gi2) this.b).O0.getValue()).a.isEmpty()) && (x = gi2.x()) != null && x.t0.b <= 0) {
                    e52 v = (gi2 = (gi2) this.b).v();
                    es8 es8 = v != null ? v.c : null;
                    Long valueOf = es8 != null ? Long.valueOf(es8.k()) : null;
                    if (valueOf != null) {
                        long longValue = valueOf.longValue();
                        hm9.m(x.a, "loadPrev: time = %d, loadPrevOperation = %s", Long.valueOf(longValue), x.t0);
                        synchronized (x.t0) {
                            try {
                                synchronized (x.t0) {
                                }
                                if (x.t0.b == longValue) {
                                    hm9.k0(x.a, (Exception) null, "loadPrev: duplicate invocation", Arrays.copyOf(new Object[0], 0));
                                    return;
                                }
                                x.u0.a();
                                x.t0.a();
                                x.s0.a();
                                x.t0.b = longValue;
                                ev evVar = x.t0;
                                qa3 qa3 = new qa3(new sa3(0, new cv(new zu(x, longValue, 0))).k(x.c).h(x.o), 1, new av(x, 0));
                                iq1 iq1 = new iq1(new av(x, 1), 0, new bv(x, 0));
                                qa3.i(iq1);
                                evVar.o = iq1;
                                return;
                            } catch (Throwable th) {
                                while (true) {
                                    throw th;
                                    break;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                bc7[] bc7Arr = MessagesListWidget.X0;
                ((bx) ((MessagesListWidget) this.b).x0().o).w();
                return;
        }
    }

    public boolean m() {
        Object obj = this.b;
        switch (this.a) {
            case 1:
                return ((lh2) ((gi2) obj).O0.getValue()).c;
            default:
                bc7[] bc7Arr = MessagesListWidget.X0;
                return ((l29) ((MessagesListWidget) obj).x0().p1.getValue()).b;
        }
    }

    public void n() {
        bc7[] bc7Arr = ContactListWidget.P0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        uo3 uo3 = contactListWidget.p0().b;
        uo3.getClass();
        ((yo3) contactListWidget.y0.getValue()).f(uo3 == uo3.a);
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 4:
                ((ab3) this.b).onError(th);
                return;
            case 5:
                r8g r8g = (r8g) this.b;
                ((hc3) r8g.c).g();
                ((ab3) r8g.o).onError(th);
                return;
            default:
                ((b38) ((g28) this.b).b).onError(th);
                return;
        }
    }

    public void p() {
        bc7[] bc7Arr = ContactListWidget.P0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        contactListWidget.getClass();
        bc7[] bc7Arr2 = ContactListWidget.P0;
        bc7 bc7 = bc7Arr2[6];
        contactListWidget.L0.b(contactListWidget, Boolean.FALSE);
        Boolean bool = (Boolean) contactListWidget.z0.getValue();
        bool.booleanValue();
        ((bh0) contactListWidget.A0.getValue()).Y.m((Object) null, bool);
        bc7 bc72 = bc7Arr2[5];
        contactListWidget.K0.b(contactListWidget, (Object) null);
        contactListWidget.p0().B0.b();
        an9.g((an9) contactListWidget.b.getValue(), wuc.CONTACTS_TAB);
    }

    public void v(long j) {
        ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.b;
        mr0.G(chatsListSearchScreen);
        bc7[] bc7Arr = ChatsListSearchScreen.J0;
        chatsListSearchScreen.n0().u(j);
    }
}
