package one.me.webapp.rootscreen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\b\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, d2 = {"Lone/me/webapp/rootscreen/WebAppRootScreen;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Lng3;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "botId", "Losf;", "entryPoint", "chatId", "", "startParam", "", "isFullscreen", "", "requestCode", "(JLosf;Ljava/lang/Long;Ljava/lang/String;ZI)V", "web-app_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController", "SetJavaScriptEnabled"})
public final class WebAppRootScreen extends BaseBottomSheetWidget implements ng3, xt3 {
    public static final /* synthetic */ bc7[] G0;
    public final glc A0;
    public final je7 B0;
    public final w4d C0;
    public final q7c D0;
    public final qm0 E0;
    public final q7c F0;
    public final fs s0;
    public final fs t0;
    public final fs u0;
    public final fs v0;
    public final fs w0;
    public final fs x0;
    public final je7 y0;
    public bwf z0;

    static {
        Class<WebAppRootScreen> cls = WebAppRootScreen.class;
        G0 = new bc7[]{new oi9(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()Ljava/lang/Long;"), rh4.g(nec.a, cls, "botId", "getBotId()J"), new oi9(cls, "entryPoint", "getEntryPoint()Lone/me/sdk/statistics/webapps/WebAppActionsStats$EntryPoint;"), new oi9(cls, "startParam", "getStartParam()Ljava/lang/String;"), new oi9(cls, "isFullscreen", "isFullscreen()Z"), new hob(cls, "requestCode", "getRequestCode()I", 0), new oi9(cls, "shareDialogJob", "getShareDialogJob()Lkotlinx/coroutines/Job;"), new hob(cls, "webView", "getWebView()Lone/me/webapp/rootscreen/ScrollTrackingWebView;", 0), new hob(cls, "webViewEventSender", "getWebViewEventSender()Lone/me/webapp/rootscreen/WebViewEventSender;", 0), new hob(cls, "toolbarView", "getToolbarView()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    }

    public WebAppRootScreen() {
        this((Bundle) null, 1, (z84) null);
    }

    public static void D0(cla cla, boolean z) {
        ecf ecf;
        int I = i24.I(qqe.e(cla.getTitle()));
        int i = 0;
        if (z) {
            ecf a = qqe.a(cla.getTitle());
            if ((a != null ? a.a : 0) == I) {
                return;
            }
        }
        if (z) {
            ecf a2 = qqe.a(cla.getTitle());
            if (a2 != null) {
                i = a2.a;
            }
            if (i != I) {
                ecf = new ecf(cla.getContext(), I, new w8c(28));
                qqe.d(cla.getTitle(), ecf);
            }
        }
        ecf = null;
        qqe.d(cla.getTitle(), ecf);
    }

    public static final void x0(WebAppRootScreen webAppRootScreen, Intent intent, c1g c1g) {
        je7 je7;
        Object obj;
        webAppRootScreen.getClass();
        byte[] bArr = c1g.a;
        String str = HTTP.PLAIN_TEXT_TYPE;
        if (bArr != null) {
            String str2 = c1g.b;
            String str3 = str2 == null ? "file" : str2;
            int i = 0;
            File file = null;
            while (true) {
                je7 = webAppRootScreen.B0;
                if (file != null && !file.exists()) {
                    break;
                } else if (i == 100) {
                    file = null;
                    break;
                } else {
                    file = ((kk5) je7.getValue()).i(au1.g(str3, i > 0 ? wg0.g(i, " (", ")") : ""));
                    i++;
                }
            }
            if (file != null) {
                zy zyVar = new zy(file, (q64) null);
                FileOutputStream f = zyVar.f();
                if (f != null) {
                    try {
                        f.write(bArr);
                        zyVar.b(f);
                    } catch (Throwable th) {
                        zyVar.a(f);
                        throw th;
                    }
                }
                String str4 = c1g.c;
                if (str4 != null) {
                    str = str4;
                }
                try {
                    intent.setType(str);
                    if (str2 != null) {
                        intent.putExtra("android.intent.extra.TITLE", str2);
                    }
                    intent.putExtra("android.intent.extra.STREAM", ((kk5) je7.getValue()).f(webAppRootScreen.getContext(), file));
                    obj = intent.addFlags(1);
                } catch (Throwable th2) {
                    obj = new njc(th2);
                }
                Throwable a = pjc.a(obj);
                if (a != null) {
                    a.toString();
                    return;
                }
                return;
            }
            return;
        }
        intent.setType(str);
    }

    public final fxc A0() {
        return (fxc) this.D0.T0(this, G0[7]);
    }

    public final boolean B0() {
        bc7 bc7 = G0[4];
        return ((Boolean) this.w0.a(this)).booleanValue();
    }

    public final void C0(boolean z) {
        Object obj;
        ArrayList e = getRouter().e();
        ListIterator listIterator = e.listIterator(e.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((coc) obj).a instanceof y16) {
                break;
            }
        }
        coc coc = (coc) obj;
        uu3 uu3 = coc != null ? coc.a : null;
        y16 y16 = uu3 instanceof y16 ? (y16) uu3 : null;
        if (y16 != null) {
            bc7[] bc7Arr = G0;
            bc7 bc7 = bc7Arr[5];
            fs fsVar = this.x0;
            if (((Number) fsVar.a(this)).intValue() != 0) {
                int i = z ? -1 : 0;
                bc7 bc72 = bc7Arr[5];
                y16.R(((Number) fsVar.a(this)).intValue(), i, (Intent) null);
            }
        }
    }

    public final void E(Bundle bundle) {
        Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("dialog_id")) : null;
        if (valueOf != null && valueOf.intValue() == 5) {
            z0().t(false);
        } else if (valueOf != null && valueOf.intValue() == 3) {
            z0().u(false);
        }
    }

    public final void E0(boolean z) {
        y0().setLeftActions(z ? new kka(new tyf(this, 2)) : new lka(new tyf(this, 3)));
    }

    public final bvc getScreenDelegate() {
        return this.A0;
    }

    public final void h(int i, Bundle bundle) {
        Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("dialog_id")) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            if (i == 1) {
                zzf z02 = z0();
                z02.getClass();
                pnf.o(z02.M0, new yyf(false));
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            if (i == 1) {
                z0().v(true);
            } else if (i == 2) {
                z0().v(false);
            }
        } else if (valueOf != null && valueOf.intValue() == 3) {
            if (i == 1) {
                z0().u(true);
            } else if (i == 2) {
                z0().u(false);
            }
        } else if (valueOf != null && valueOf.intValue() == 4) {
            if (i == 1) {
                ouf s = z0().s();
                j47.T(s.c, ((w9a) s.e()).a(), (vx3) null, new wtf(s, (Continuation) null, true), 2);
            } else if (i == 2) {
                ouf s2 = z0().s();
                j47.T(s2.c, ((w9a) s2.e()).a(), (vx3) null, new wtf(s2, (Continuation) null, false), 2);
            }
        } else if (valueOf == null || valueOf.intValue() != 5) {
        } else {
            if (i == 1) {
                z0().t(true);
            } else if (i == 2) {
                z0().t(false);
            }
        }
    }

    public final boolean handleBack() {
        zzf z02 = z0();
        if (((Boolean) z02.F0.getValue()).booleanValue()) {
            c8d c8d = z02.D0;
            c8d.getClass();
            j47.T((sx3) c8d.a, (lx3) null, (vx3) null, new da7(c8d, (Continuation) null), 3);
            return true;
        }
        pnf.n(z02, (lx3) null, (vx3) null, new pzf(z02, (Continuation) null), 3);
        return true;
    }

    public final z5b n0() {
        return new ke2(this, 1);
    }

    public final x27 o0() {
        if (!B0()) {
            return this.o;
        }
        x27 x27 = x27.c;
        return x27.d;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1013 && A0().getFilePathCallback() != null) {
            String str = null;
            if (i2 == -1) {
                if ((intent != null ? intent.getDataString() : null) != null) {
                    str = intent.getDataString();
                }
            }
            zzf z02 = z0();
            z02.getClass();
            pnf.o(z02.M0, new jzf(str));
        }
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new qq0(15, this));
        } else if (qqe.c(y0().getTitle())) {
            D0(y0(), true);
        }
        zzf z02 = z0();
        if (!z02.J0) {
            je7 je7 = z02.z0;
            if (((kxc) ((hp) je7.getValue())).d("app.pinLock.screenshotEnabled", true)) {
                ((kxc) ((hp) je7.getValue())).t(false);
            }
        }
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.z0 = null;
    }

    public final void onDetach(View view) {
        super.onDetach(view);
        zzf z02 = z0();
        if (!z02.J0) {
            je7 je7 = z02.z0;
            if (!((kxc) ((hp) je7.getValue())).d("app.pinLock.screenshotEnabled", true)) {
                ((kxc) ((hp) je7.getValue())).t(true);
            }
        }
    }

    public final void onDismiss() {
        bc7[] bc7Arr = G0;
        bc7 bc7 = bc7Arr[6];
        w4d w4d = this.C0;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[6], (Object) null);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        String string = getArgs().getString("web_root_screen:url");
        if (string != null) {
            A0().loadUrl(string);
        }
        this.z0 = new bwf(requireActivity(), (k56) new e09(0, z0(), zzf.class, "onBiometrySuccess", "onBiometrySuccess()V", 0, 15), (k56) new e09(0, z0(), zzf.class, "onBiometryFail", "onBiometryFail()V", 0, 16));
        s35 s35 = z0().M0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(s35, getViewLifecycleOwner().Q(), fg7), new vyf((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g((gld) z0().O0.getValue(), getViewLifecycleOwner().Q(), fg7), new wyf((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final boolean r0() {
        zzf z02 = z0();
        if (!((Boolean) z02.G0.getValue()).booleanValue()) {
            return true;
        }
        pnf.n(z02, (lx3) null, (vx3) null, new pzf(z02, (Continuation) null), 3);
        return false;
    }

    public final void u0() {
        zzf z02 = z0();
        if (!z02.I0) {
            w97 w97 = z02.P0;
            if (w97 != null) {
                w97.b(new s0());
            }
            z02.P0 = null;
            z02.Q0 = null;
            ConcurrentHashMap concurrentHashMap = z02.R0;
            concurrentHashMap.size();
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                ((Number) entry.getKey()).longValue();
                ((w97) entry.getValue()).b(new Throwable());
            }
            concurrentHashMap.clear();
            vxd vxd = z02.S0;
            if (vxd != null) {
                vxd.cancel((CancellationException) null);
            }
            z02.S0 = null;
            bc7[] bc7Arr = zzf.T0;
            bc7 bc7 = bc7Arr[0];
            w4d w4d = z02.C0;
            x77 x77 = (x77) w4d.T0(z02, bc7);
            if (x77 != null) {
                x77.cancel((CancellationException) null);
            }
            w4d.o1(z02, bc7Arr[0], (Object) null);
        }
        zzf z03 = z0();
        if (!z03.I0) {
            z03.I0 = true;
            vsf vsf = (vsf) z03.w0.getValue();
            wsf wsf = z03.B0;
            if (wsf != null) {
                vsf.a(2, wsf.a, wsf.b, wsf.c, wsf.d, (String) null);
            }
        }
    }

    public final void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tyf tyf = new tyf(this, 1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(kla.c);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tyf.invoke(linearLayout);
        frameLayout.addView(linearLayout);
    }

    public final void y(int i, Bundle bundle) {
        if (i == 1) {
            zzf z02 = z0();
            z02.getClass();
            vxd n = pnf.n(z02, (lx3) null, vx3.b, new qzf(z02, (Continuation) null), 1);
            z02.C0.o1(z02, zzf.T0[0], n);
        }
    }

    public final cla y0() {
        return (cla) this.F0.T0(this, G0[9]);
    }

    public final zzf z0() {
        return (zzf) this.y0.getValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebAppRootScreen(Bundle bundle, int i, z84 z84) {
        this((i & 1) != 0 ? null : bundle);
    }

    public WebAppRootScreen(Bundle bundle) {
        super(bundle);
        Class<Long> cls = Long.class;
        this.s0 = new fs(cls, "web_root_screen:chat_id");
        this.t0 = new fs(cls, "web_root_screen:bot_id");
        this.u0 = new fs(osf.class, "web_root_screen:entry_point");
        this.v0 = new fs(String.class, "web_root_screen:start_param");
        this.w0 = new fs(Boolean.class, Boolean.FALSE, "web_root_screen:is_fullscreen");
        this.x0 = new fs(Integer.class, 0, "web_root_screen.request_code.key");
        this.y0 = createViewModelLazy(zzf.class, new nhd(16, new syf(this, 0)));
        this.A0 = new glc(new bse(21), new e09(0, this, WebAppRootScreen.class, "buildScreenParams", "buildScreenParams()Lone/me/sdk/statistics/params/Params;", 0, 17), 4);
        this.B0 = jwf.a.getAccessor().d(kk5.class);
        this.C0 = mqd.D();
        this.D0 = viewBinding(kla.j);
        this.E0 = binding(new syf(this, 1));
        this.F0 = viewBinding(kla.i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebAppRootScreen(long j, osf osf, Long l, String str, boolean z, int i, int i2, z84 z84) {
        this(j, osf, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? 0 : i);
    }

    public WebAppRootScreen(long j, osf osf, Long l, String str, boolean z, int i) {
        this(dy7.g(new kpa("web_root_screen:bot_id", Long.valueOf(j)), new kpa("web_root_screen:entry_point", osf), new kpa("web_root_screen:chat_id", l), new kpa("web_root_screen:start_param", str), new kpa("web_root_screen:is_fullscreen", Boolean.valueOf(z)), new kpa("web_root_screen.request_code.key", Integer.valueOf(i))));
    }
}
