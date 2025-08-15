package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.members.list.MembersListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ga  reason: default package */
public final /* synthetic */ class ga implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ga(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        String str;
        Context context;
        Set set;
        boolean z = false;
        wnc wnc = null;
        e5f e5f = e5f.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                ((ia) obj3).c(((z9f) ((ol7) obj2)).o, !((Boolean) obj).booleanValue());
                return e5f;
            case 1:
                zj zjVar = (zj) obj3;
                hm9.p(zjVar.s0, "fail to load static image", (Throwable) obj);
                zjVar.e(uj.a);
                ((f9f) obj2).c = null;
                return e5f;
            case 2:
                l20 l20 = (l20) obj;
                g20 g20 = l20.a;
                g20 g202 = g20.o;
                ld2 ld2 = (ld2) obj3;
                Context context2 = ld2.a;
                je7 je7 = ld2.f;
                es8 es8 = (es8) obj2;
                if (g20 == g202) {
                    boolean z2 = l20.d.b == 2;
                    Uri a2 = ((o20) ((t00) je7.getValue())).a(l20);
                    f9f f9f = a2 != null ? new f9f(context2, ((o20) ((t00) je7.getValue())).c(l20, s5c.U(l20, es8)), a2.toString()) : null;
                    if (f9f != null) {
                        if (z2) {
                            wnc = new wnc();
                            wnc.b = true;
                        }
                        rq4 rq4 = f9f.a.o;
                        rq4.getClass();
                        ((la6) rq4).n(wnc);
                    }
                    return new LayerDrawable(new Drawable[]{f9f, new InsetDrawable((Drawable) ld2.r.getValue(), z2 ? 0.25f : 0.1f)});
                } else if (g20 == g20.Y) {
                    f20 j = es8.a.j();
                    if (j != null) {
                        str = j.h;
                        if (oag.t(str)) {
                            str = j.b;
                        }
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        f9f f9f2 = new f9f(context2);
                        f9f2.c((Uri) null, str);
                        return f9f2;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    Uri a3 = ((o20) ((t00) je7.getValue())).a(l20);
                    if (a3 == null) {
                        return null;
                    }
                    return new f9f(context2, ((o20) ((t00) je7.getValue())).c(l20, s5c.U(l20, es8)), a3.toString());
                }
            case 3:
                ((m56) obj3).invoke(((CharSequence) obj).toString());
                ((pl2) obj2).E((a73) null);
                return e5f;
            case 4:
                int intValue = ((Integer) obj).intValue();
                if (intValue >= 0) {
                    mfd mfd = ((ChatNotificationsSettingsScreen) obj3).c;
                    if (intValue >= mfd.j() || ((kfd) ((ol7) mfd.C(intValue))).getItemId() != ((long) dea.f)) {
                        return null;
                    }
                    return z7.B(((EndlessRecyclerView2) obj2).getContext(), eea.b).toUpperCase(Locale.ROOT);
                }
                bc7[] bc7Arr = ChatNotificationsSettingsScreen.Y;
                return null;
            case 5:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) obj3;
                int l = chatsListSearchScreen.F0.l(((Integer) obj).intValue());
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) obj2;
                if (l == z8a.m) {
                    return endlessRecyclerView2.getResources().getString(yoc.A0);
                }
                if (l == z8a.s) {
                    return endlessRecyclerView2.getResources().getString(yoc.C0);
                }
                if (l == p8a.m) {
                    if (chatsListSearchScreen.x0.j() == 0) {
                        return endlessRecyclerView2.getResources().getString(r8a.x);
                    }
                    return null;
                } else if (l == p8a.p) {
                    return endlessRecyclerView2.getResources().getString(yoc.B0);
                } else {
                    if (l == p8a.r) {
                        return endlessRecyclerView2.getResources().getString(r8a.z);
                    }
                    return null;
                }
            case 6:
                if (lw2.$EnumSwitchMapping$0[((yha) obj).ordinal()] == 1) {
                    nx2 nx2 = (nx2) obj3;
                    nx2.T0.o1(nx2, nx2.X0[0], pnf.n(nx2, ((w9a) nx2.Y).b(), (vx3) null, new mx2(nx2, ((uj3) obj2).n(), (Continuation) null), 2));
                }
                return e5f;
            case 7:
                ChatsListWidget chatsListWidget = (ChatsListWidget) obj3;
                if (((Integer) obj).intValue() != chatsListWidget.A0.j() + chatsListWidget.B0.j() || chatsListWidget.C0.j() <= 0) {
                    return null;
                }
                return ((nn3) obj2).b;
            case 8:
                long longValue = ((Long) obj).longValue();
                fn3 fn3 = (fn3) ((a3g) obj2).Y;
                nn3 nn3 = (nn3) obj3;
                if (nn3.v0) {
                    fn3.N();
                } else if (nn3.Y != null) {
                    fn3.d(longValue);
                } else {
                    fn3.v(longValue);
                }
                return e5f;
            case 9:
                pua pua = (pua) obj;
                if (!((Set) obj3).contains(pua) && !c54.O(pua).contains(Long.valueOf(((uj3) obj2).o()))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((a66) obj3).invoke(Long.valueOf(((nn3) obj2).a), bool);
                return e5f;
            case 11:
                int intValue2 = ((Integer) obj).intValue();
                bc7[] bc7Arr2 = ContactListWidget.P0;
                ContactListWidget contactListWidget = (ContactListWidget) obj3;
                CharSequence n0 = contactListWidget.n0();
                if (n0 == null || n0.length() == 0) {
                    return null;
                }
                int l2 = contactListWidget.v0.l(intValue2);
                RecyclerView recyclerView = (RecyclerView) obj2;
                if (l2 == z8a.m) {
                    return recyclerView.getResources().getString(yoc.z0);
                }
                if (l2 == z8a.p) {
                    return recyclerView.getResources().getString(yoc.B0);
                }
                return null;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                Double d = (Double) obj;
                kk4 kk4 = (kk4) obj3;
                kg1 kg1 = kk4.v0;
                Collection<fg1> i = kg1.i();
                HashMap hashMap = new HashMap(i.size());
                for (fg1 fg1 : i) {
                    hashMap.put(fg1.a, Float.valueOf(d.floatValue()));
                }
                hashMap.put(kg1.a.a, Float.valueOf(d.floatValue()));
                co9 co9 = new co9(hashMap);
                ((sf0) obj2).b(kk4.Y, "DirectCallTopology", "send 'virtual' NetworkStatusNotification: " + co9);
                kk4.R0.b(co9);
                return e5f;
            case 13:
                xg1 xg1 = (xg1) obj2;
                ((Boolean) obj).getClass();
                cb5 cb5 = (cb5) obj3;
                w4d w4d = cb5.h;
                bc7[] bc7Arr3 = cb5.i;
                x77 x77 = (x77) w4d.T0(cb5, bc7Arr3[0]);
                if (x77 != null) {
                    x77.cancel((CancellationException) null);
                }
                cb5.h.o1(cb5, bc7Arr3[0], (Object) null);
                cb5.b().c = null;
                try {
                    xg1 xg12 = cb5.g;
                    WindowManager z3 = (xg12 == null || (context = xg12.getContext()) == null) ? null : nd7.z(context);
                    if (z3 != null) {
                        z3.removeView(xg1);
                    }
                } catch (IllegalArgumentException e) {
                    hm9.p("FakePipController", "can't hide call local pip", e);
                }
                cb5.g = null;
                return e5f;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((a66) obj3).invoke((rd6) obj2, bool2);
                return e5f;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                Throwable th = (Throwable) obj;
                ((wh6) obj3).a.removeCallbacks((Runnable) obj2);
                return e5f;
            case 16:
                View view = (View) obj;
                bc7[] bc7Arr4 = InputPhoneScreen.E0;
                mr0.I((cla) obj3);
                q27 q0 = ((InputPhoneScreen) obj2).q0();
                q0.getClass();
                du7.c.getClass();
                pnf.o(q0.Y, new c64(":webview/faq"));
                return e5f;
            case LangUtils.HASH_SEED /*17*/:
                ((Long) obj).getClass();
                fo8 fo8 = (fo8) ((a3g) obj2).Y;
                kn8 kn8 = (kn8) obj3;
                if (kn8.s0) {
                    pnf.o(((MembersListWidget) fo8).o0().X, po8.a);
                } else {
                    boolean z4 = kn8.t0;
                    long j2 = kn8.a;
                    if (z4) {
                        ro8 o0 = ((MembersListWidget) fo8).o0();
                        o0.getClass();
                        pnf.o(o0.X, new oo8(j2));
                    } else {
                        ((MembersListWidget) fo8).o0().t(j2, kn8.v0);
                    }
                }
                return e5f;
            case 18:
                Integer num = (Integer) obj;
                num.getClass();
                bc7[] bc7Arr5 = MembersListWidget.D0;
                kn8 kn82 = (kn8) ((m56) obj3).invoke(num);
                if (kn82 != null && (set = (Set) ((MembersListWidget) obj2).o0().Z.getValue()) != null && set.contains(Long.valueOf(kn82.a)) && kn82.v0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                dk2 dk2 = (dk2) obj;
                if (dk2.a.a != ((hyc) ((jq8) obj3).Y).t() && ((cu8) obj2).o <= dk2.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                ol7 ol7 = (ol7) ((MessageContextMenuBottomSheet) obj3).W0.C(((Integer) obj).intValue());
                if (!(ol7 instanceof jn8) || !((jn8) ol7).t0) {
                    return null;
                }
                return ((RecyclerView) obj2).getContext().getString(oda.p0);
            case 21:
                Throwable th2 = (Throwable) obj;
                ((aj9) obj3).e(((zi9) obj2).b);
                return e5f;
            case 22:
                Continuation continuation = (Continuation) obj;
                yx9 yx9 = (yx9) obj3;
                yx9.getClass();
                List<wd5> list = (List) obj2;
                ArrayList arrayList = new ArrayList(z53.S(list, 10));
                for (wd5 wd5 : list) {
                    arrayList.add(wd5.a + "_" + wd5.b);
                }
                return ote.j(yx9.a, new xx9(yx9, arrayList, 1), continuation);
            case 23:
                x45 x45 = (x45) obj;
                iba iba = (iba) obj3;
                eba b2 = iba.b();
                b2.getClass();
                LinkedTransferQueue linkedTransferQueue = new LinkedTransferQueue();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                x45 x452 = (x45) obj2;
                Integer valueOf = Integer.valueOf(x452.g);
                bkb bkb = b2.a;
                String str2 = x452.a;
                ThreadFactory s = bkb.s(str2, valueOf);
                int i2 = x452.b;
                int i3 = x452.c;
                long j3 = x452.d;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i3, j3, timeUnit, linkedTransferQueue, s);
                if (x452.e && j3 > 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                threadPoolExecutor.setRejectedExecutionHandler(new qw1(1));
                if (x452.f) {
                    threadPoolExecutor.prestartAllCoreThreads();
                }
                return iba.i(threadPoolExecutor, str2);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                String str3 = (String) obj;
                if (((SharedPreferences) ((je7) ((adb) obj3).b).getValue()).getString((String) obj2, (String) null) == null) {
                    return null;
                }
                throw new Error("An operation is not implemented: ONEME-18754 Добавить поддержку кастомных тем");
            case 25:
                int intValue3 = ((Integer) obj).intValue();
                bc7[] bc7Arr6 = PickerMembersListWidget.x0;
                hdc adapter = ((EndlessRecyclerView2) obj3).getAdapter();
                PickerMembersListWidget pickerMembersListWidget = (PickerMembersListWidget) obj2;
                nxa nxa = pickerMembersListWidget.Y;
                if (adapter != nxa) {
                    nxa = pickerMembersListWidget.Z;
                }
                if (nxa.j() > intValue3 && intValue3 >= 0) {
                    z = ((Set) pickerMembersListWidget.o0().Z.a.getValue()).contains(Long.valueOf(((pxa) ((ol7) nxa.C(intValue3))).a));
                }
                return Boolean.valueOf(z);
            case 26:
                Long l3 = (Long) obj;
                return ((v6b) ((t6b) obj3).b.getValue()).a((e52) null, (cu8) obj2);
            case 27:
                ktc ktc = (ktc) obj;
                if (ktc instanceof itc) {
                    sj3 sj3 = (sj3) obj3;
                    if (sj3 != null) {
                        sj3.accept(((itc) ktc).a);
                    }
                } else if (ktc instanceof jtc) {
                    ((sj3) obj2).accept(ktc);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return e5f;
            case 28:
                izc izc = (izc) obj;
                ((ChatsListSearchScreen) ((tyc) ((xq3) obj3).Y)).o0((izc) obj2);
                return e5f;
            default:
                nzc nzc = (nzc) obj3;
                w6b h = nzc.b.h((String) obj);
                return new w6b(ema.v(qp4.u0.b(nzc.a).i(), h, ema.s(h.a.toString(), ((kzc) obj2).c)), h.b);
        }
    }
}
