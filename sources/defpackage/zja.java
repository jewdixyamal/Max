package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.server.ServerPortBottomSheet;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.pincode.SetupPinCodeScreen;
import one.me.sharedata.ShareDataPickerScreen;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.onechat.reactions.ReactionsViewModel;
import ru.ok.tamtam.nano.Protos;

/* renamed from: zja  reason: default package */
public final /* synthetic */ class zja implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zja(une une) {
        this.a = 28;
        this.b = iua.TYPE_CHAT_MARK;
        this.c = une;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v25, types: [java.lang.Object, umd] */
    public final Object invoke() {
        long j;
        pq9 pq9 = qp4.u0;
        Integer num = null;
        boolean z = true;
        e5f e5f = e5f.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                TextView textView = new TextView((Context) obj2);
                i4f.p.b(textView, du4.b);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                float f = (float) 12;
                float f2 = (float) 4;
                textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                ((cka) obj).addView(textView);
                return textView;
            case 1:
                ((ela) obj2).a();
                ((k56) obj).invoke();
                return e5f;
            case 2:
                ((ProfileChangeLinkScreen) ((jcb) ((a3g) obj2).Y)).p0().b.g(((x6) ((efb) obj)).a);
                return e5f;
            case 3:
                bc7[] bc7Arr = ProfileChangeLinkScreen.v0;
                long j2 = ((Bundle) obj2).getLong("entity:id");
                ProfileChangeLinkScreen profileChangeLinkScreen = (ProfileChangeLinkScreen) obj;
                profileChangeLinkScreen.getClass();
                bc7 bc7 = ProfileChangeLinkScreen.v0[1];
                return new l22(j2, (reb) profileChangeLinkScreen.b.a(profileChangeLinkScreen), profileChangeLinkScreen.n0());
            case 4:
                x6 x6Var = (x6) ((efb) obj);
                long j3 = (long) x6Var.a;
                if (x6Var.b.o != jfd.o) {
                    z = false;
                }
                ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = (ProfileEditAdminPermissionsWidget) ((mdb) ((jv5) obj2).Y);
                if (z) {
                    profileEditAdminPermissionsWidget.o0().w();
                } else {
                    feb o0 = profileEditAdminPermissionsWidget.o0();
                    bc7[] bc7Arr2 = feb.G0;
                    o0.v(j3, false);
                }
                return e5f;
            case 5:
                bc7[] bc7Arr3 = ProfileEditScreen.y0;
                Parcelable parcelable = ((Bundle) obj).getParcelable("profile:type");
                if (parcelable != null) {
                    return new vgb(((ProfileEditScreen) obj2).a, (reb) parcelable);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 6:
                ((ProfileEditScreen) ((igb) ((a3g) obj2).Y)).n0().b.a(((x6) ((efb) obj)).a);
                return e5f;
            case 7:
                jib m0 = ((ProfileInviteScreen) ((xhb) obj2).X).m0();
                m0.getClass();
                int i = wea.P;
                int i2 = ((yib) ((cjb) obj)).a;
                s35 s35 = m0.B0;
                if (i2 == i) {
                    String s = m0.s();
                    if (s != null) {
                        pnf.o(s35, new rhb(new gqe(yoc.i, ys.m0(new Object[]{s}))));
                    }
                } else if (i2 == wea.O) {
                    String s2 = m0.s();
                    if (s2 != null) {
                        pnf.o(s35, new qhb(s2));
                    }
                } else if (i2 == wea.M) {
                    ckb.c.getClass();
                    wg0.k(zr6.k(new StringBuilder(":profile/edit/link?id="), m0.b, "&type=local_chat&flow=edit"), s35);
                }
                return e5f;
            case 8:
                bc7[] bc7Arr4 = ProfileScreen.D0;
                Bundle bundle = (Bundle) obj2;
                long j4 = bundle.getLong("profile:id");
                Class<hdb> cls = hdb.class;
                Object v = ay7.v(bundle, "profile:id_type", cls);
                if (v != null) {
                    return new cnb(j4, (hdb) ((Parcelable) v), bundle.getBoolean("profile:opened_from_dialog"), new y7g((k56) new clb((ProfileScreen) obj, 0)));
                }
                throw new IllegalArgumentException(zr6.i("No value passed for key profile:id_type of type ", cls.getSimpleName(), " in bundle").toString());
            case 9:
                View view = new View((Context) obj2);
                bsb bsb = (bsb) obj;
                view.setBackground((Drawable) bsb.c.getValue());
                bsb.addView(view);
                return view;
            case 10:
                ((k56) obj2).invoke();
                return Boolean.valueOf(((b6c) obj).isLaidOut());
            case 11:
                return new d7c((je7) obj2, (ReactionsViewModel) obj);
            case Protos.Attaches.Attach.PRESENT:
                elc elc = (elc) obj2;
                long a2 = ((wxc) elc.e.getValue()).a();
                k92 k92 = (k92) obj;
                boolean f3 = k92.f(a2);
                if (f3) {
                    yrc a3 = elc.d().a(a2);
                    if (a3 != null) {
                        j = a3.b;
                        long d = elc.c().d(new la2(j, k92.a, k92, k92.a().e, lz7.k(((t19) elc.d.getValue()).k(k92.j), k92), k92.l), ((d56) elc.f.getValue()).a);
                        if (f3 && j == 0) {
                            elc.d().b(a2, d);
                        }
                        return Long.valueOf(d);
                    }
                } else {
                    long j5 = k92.a;
                    if (j5 != 0) {
                        j = elc.c().f(j5);
                    } else {
                        long j6 = k92.l;
                        if (j6 != 0) {
                            dt2 c2 = elc.c();
                            c2.getClass();
                            xlc a4 = xlc.a(1, "SELECT id FROM chats WHERE cid = ?");
                            a4.j(1, j6);
                            ilc ilc = c2.a;
                            ilc.b();
                            Cursor o = ilc.o(a4, (CancellationSignal) null);
                            try {
                                long j7 = o.moveToFirst() ? o.getLong(0) : 0;
                                o.close();
                                a4.n();
                                j = j7;
                            } catch (Throwable th) {
                                o.close();
                                a4.n();
                                throw th;
                            }
                        }
                    }
                    long d2 = elc.c().d(new la2(j, k92.a, k92, k92.a().e, lz7.k(((t19) elc.d.getValue()).k(k92.j), k92), k92.l), ((d56) elc.f.getValue()).a);
                    elc.d().b(a2, d2);
                    return Long.valueOf(d2);
                }
                j = 0;
                long d22 = elc.c().d(new la2(j, k92.a, k92, k92.a().e, lz7.k(((t19) elc.d.getValue()).k(k92.j), k92), k92.l), ((d56) elc.f.getValue()).a);
                elc.d().b(a2, d22);
                return Long.valueOf(d22);
            case 13:
                a14.w((Activity) obj2, (Intent) obj);
                return e5f;
            case Protos.Attaches.Attach.LOCATION:
                Activity activity = (Activity) obj2;
                if (((nmc) activity).h()) {
                    a14.e((RootController) obj, activity.getIntent());
                }
                a14.w(activity, activity.getIntent());
                return e5f;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                caa caa = new caa((Context) obj2);
                caa.setId(y7a.C0);
                float f4 = (float) 20;
                knc knc = (knc) obj;
                knc.setMinWidth(tu0.G(fk4.c() * f4));
                knc.setMinHeight(tu0.G(fk4.c() * f4));
                caa.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                pq9.p(caa).c.getText();
                caa.setTextColor(-1);
                caa.setVisibility(8);
                return caa;
            case 16:
                ((yz0) ((ez0) ((vvc) obj2).o.getValue())).C0.g(new hb(((RecordManager.StopParams) obj).getRemoveRecord()));
                return e5f;
            case LangUtils.HASH_SEED:
                TextPaint textPaint = new TextPaint();
                v5d v5d = (v5d) obj;
                ((kqe) obj2).a(textPaint, v5d.a.getResources().getDisplayMetrics(), (du4) v5d.f.getValue());
                return textPaint;
            case 18:
                bc7[] bc7Arr5 = ServerPortBottomSheet.B0;
                mr0.I((OneMeButton) obj2);
                ((ServerPortBottomSheet) obj).s0(true);
                return e5f;
            case 19:
                wo0 wo0 = (wo0) ((ol7) obj);
                bc7[] bc7Arr6 = SettingsBlacklistScreen.Z;
                ped m02 = ((SettingsBlacklistScreen) ((gaa) obj2).a).m0();
                m02.getClass();
                Bundle bundle2 = new Bundle(0);
                bundle2.putLong("user_unblock_id", wo0.a);
                pnf.o(m02.y0, new aed(new gqe(kha.b, ys.m0(new Object[]{wo0.c})), y53.M(new zdd(iha.d, new eqe(kha.c), true), new zdd(iha.e, new eqe(kha.a), false)), (wuc) null, bundle2, 4));
                return e5f;
            case 20:
                int i3 = SetupPinCodeScreen.o;
                mr0.I((m0b) obj2);
                i3a onBackPressedDispatcher = ((SetupPinCodeScreen) obj).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return e5f;
            case 21:
                bc7[] bc7Arr7 = ShareDataPickerScreen.D0;
                ShareDataPickerScreen shareDataPickerScreen = (ShareDataPickerScreen) obj2;
                ((ckd) shareDataPickerScreen.v0().c).k.z(4);
                br7.d((View) obj, ShareDataPickerScreen.E0, (m56) null);
                shareDataPickerScreen.x0().setLeftIcon(woc.a1);
                return e5f;
            case 22:
                bc7[] bc7Arr8 = ShareDataPickerScreen.D0;
                ShareDataPickerScreen shareDataPickerScreen2 = (ShareDataPickerScreen) obj2;
                ckd ckd = (ckd) shareDataPickerScreen2.v0().c;
                CharSequence text = ((sv8) obj).getText();
                ckd.getClass();
                if (!((Set) shareDataPickerScreen2.v0().Z.a.getValue()).isEmpty() && !ckd.m) {
                    ckd.m = true;
                    sx3 sx3 = ckd.l;
                    if (sx3 != null) {
                        j47.S(sx3, xq9.a.plus(((w9a) ((kke) ckd.d.getValue())).a()), vx3.c, new bkd(ckd, text, (Continuation) null));
                    }
                    ckd.i.g(dkd.a);
                }
                return e5f;
            case 23:
                tjd tjd = (tjd) obj;
                ((xkd) obj2).s0.invoke(new g19(tjd.g, tjd));
                return e5f;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                Context context = ((and) obj2).a;
                ActivityManager activityManager = (ActivityManager) lt3.b(context, ActivityManager.class);
                if (activityManager != null) {
                    num = Integer.valueOf(activityManager.getLauncherLargeIconSize());
                }
                Drawable u = ngg.u(yfa.i, k7d.h(pq9, context).k, context);
                Bitmap B = f8.B(u, num != null ? num.intValue() : u.getIntrinsicWidth(), num != null ? num.intValue() : u.getIntrinsicHeight());
                String string = context.getString(b2c.shortcut_id_create_chat);
                ? obj3 = new Object();
                obj3.a = context;
                obj3.b = string;
                obj3.d = context.getString(jpc.b3);
                obj3.f = IconCompat.b(B);
                vw7.c.getClass();
                je7 je7 = (je7) obj;
                String str = ((fl7) ((al) je7.getValue())).b;
                String str2 = ((fl7) ((al) je7.getValue())).e;
                Intent intent = new Intent(context, MainActivity.class);
                intent.setAction("CUSTOM_DEEP_LINK");
                intent.setData(Uri.parse(str + "://" + str2 + "/:start-conversation"));
                obj3.c = new Intent[]{intent};
                if (!TextUtils.isEmpty(obj3.d)) {
                    Intent[] intentArr = obj3.c;
                    if (intentArr != null && intentArr.length != 0) {
                        return obj3;
                    }
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            case 25:
                w3e w3e = (w3e) ((vt3) obj2).I0;
                if (w3e != null) {
                    ((t5e) obj).c(w3e);
                }
                return e5f;
            case 26:
                ((k56) obj2).invoke();
                ((tge) obj).onDismiss();
                return e5f;
            case 27:
                return i24.l((go0) ((je7) obj2).getValue(), ((vge) obj).Z, woc.Q1);
            case 28:
                StringBuilder sb = new StringBuilder("Cancelling task of type=");
                sb.append((iua) obj2);
                sb.append(", task=");
                une une = (une) obj;
                sb.append(une.f.getClass().getName());
                sb.append(", id=");
                sb.append(une.a);
                sb.append(", status=");
                sb.append(une.b);
                return sb.toString();
            default:
                return ((ct0) ((je7) obj2).getValue()).a(((wve) obj).a);
        }
    }

    public /* synthetic */ zja(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
