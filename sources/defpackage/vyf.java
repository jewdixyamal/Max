package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: vyf  reason: default package */
public final class vyf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppRootScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vyf(Continuation continuation, WebAppRootScreen webAppRootScreen) {
        super(2, continuation);
        this.Y = webAppRootScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((vyf) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vyf vyf = new vyf(continuation, this.Y);
        vyf.X = obj;
        return vyf;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        kzf kzf = (kzf) this.X;
        bc7[] bc7Arr = WebAppRootScreen.G0;
        WebAppRootScreen webAppRootScreen = this.Y;
        webAppRootScreen.getClass();
        if (kzf instanceof azf) {
            azf azf = (azf) kzf;
            webAppRootScreen.A0().loadUrl(azf.a);
            webAppRootScreen.getArgs().putString("web_root_screen:url", azf.a);
        } else {
            znc znc = null;
            if (kzf instanceof ezf) {
                String str = ((ezf) kzf).a;
                Bundle g = zr6.g(1, "dialog_id");
                String string = webAppRootScreen.getContext().getResources().getString(x1c.web_app_root_close_dialog_subtitle, new Object[]{str});
                bc7[] bc7Arr2 = BottomSheetWidget.x0;
                lg3 e = wg0.e(x1c.web_app_root_close_dialog_title, 4, g);
                e.f(new iqe(string));
                e.a(new mg3(1, new eqe(x1c.web_app_root_close_dialog_accept), 3, false));
                e.a(new mg3(2, new eqe(x1c.web_app_root_close_dialog_decline), 2, false));
                ConfirmationBottomSheet e2 = e.e();
                e2.setTargetController(webAppRootScreen);
                uu3 uu3 = webAppRootScreen;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                e2.z0(webAppRootScreen);
                if (znc != null) {
                    coc coc = new coc(e2, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc, true, "BottomSheetWidget");
                    znc.G(coc);
                }
            } else if (kzf instanceof yyf) {
                webAppRootScreen.s0(true);
                webAppRootScreen.C0(((yyf) kzf).a);
            } else if (kzf instanceof dzf) {
                bc7 bc7 = WebAppRootScreen.G0[8];
                t3g t3g = (t3g) webAppRootScreen.E0.getValue();
                dzf dzf = (dzf) kzf;
                String str2 = dzf.a;
                t3g.getClass();
                t3g.a.evaluateJavascript(String.format("\n            (() => {\n                WebApp.sendEvent(\"%s\", \"%s\");\n            })();\n        ", Arrays.copyOf(new Object[]{str2, eae.n0(dzf.b, "\"", "\\\"")}, 2)), (ValueCallback) null);
            } else if (kzf instanceof hzf) {
                String str3 = ((hzf) kzf).a;
                Bundle g2 = zr6.g(2, "dialog_id");
                String string2 = webAppRootScreen.getContext().getResources().getString(x1c.web_app_root_phone_request_dialog_subtitle, new Object[]{str3});
                bc7[] bc7Arr3 = BottomSheetWidget.x0;
                lg3 e3 = wg0.e(x1c.web_app_root_phone_request_dialog_title, 4, g2);
                e3.f(new iqe(string2));
                e3.a(new mg3(1, new eqe(x1c.web_app_root_phone_request_dialog_accept), 3, false));
                e3.a(new mg3(2, new eqe(x1c.web_app_root_phone_request_dialog_decline), 2, false));
                ConfirmationBottomSheet e4 = e3.e();
                e4.setTargetController(webAppRootScreen);
                uu3 uu32 = webAppRootScreen;
                while (uu32.getParentController() != null) {
                    uu32 = uu32.getParentController();
                }
                foc foc2 = uu32 instanceof foc ? (foc) uu32 : null;
                if (foc2 != null) {
                    znc = foc2.T();
                }
                e4.z0(webAppRootScreen);
                if (znc != null) {
                    coc coc2 = new coc(e4, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc2, true, "BottomSheetWidget");
                    znc.G(coc2);
                }
            } else if (kzf instanceof bzf) {
                String str4 = ((bzf) kzf).a;
                if (str4.length() != 0) {
                    try {
                        webAppRootScreen.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str4)));
                    } catch (ActivityNotFoundException e5) {
                        e5.getMessage();
                    }
                }
            } else if (kzf instanceof zyf) {
                webAppRootScreen.C0(true);
                webAppRootScreen.t0();
                zxf.c.P1().b(":link-intercept", dy7.g(new kpa("link", ((zyf) kzf).a)));
            } else if (kzf instanceof izf) {
                izf izf = (izf) kzf;
                webAppRootScreen.C0.o1(webAppRootScreen, WebAppRootScreen.G0[6], j47.T(webAppRootScreen.getViewLifecycleScope(), (lx3) null, vx3.b, new xyf(izf.a, webAppRootScreen, izf.b, (Continuation) null), 1));
            } else if (kzf instanceof gzf) {
                webAppRootScreen.startActivityForResult(((gzf) kzf).a.createIntent(), 1013);
            } else if (kzf instanceof jzf) {
                String str5 = ((jzf) kzf).a;
                Uri[] uriArr = str5 != null ? new Uri[]{Uri.parse(str5)} : null;
                ValueCallback<Uri[]> filePathCallback = webAppRootScreen.A0().getFilePathCallback();
                if (filePathCallback != null) {
                    filePathCallback.onReceiveValue(uriArr);
                    webAppRootScreen.A0().setFilePathCallback((ValueCallback<Uri[]>) null);
                }
            } else if (kzf instanceof fzf) {
                String str6 = ((fzf) kzf).a;
                Bundle g3 = zr6.g(3, "dialog_id");
                bc7[] bc7Arr4 = BottomSheetWidget.x0;
                lg3 e6 = wg0.e(x1c.web_app_root_download_file_bottomsheet_title, 4, g3);
                e6.f(new gqe(x1c.web_app_root_download_file_bottomsheet_subtitle, ys.m0(new Object[]{str6})));
                e6.a(new mg3(1, new eqe(x1c.web_app_root_download_file_bottomsheet_accept), 4, false));
                e6.a(new mg3(2, new eqe(x1c.web_app_root_download_file_bottomsheet_decline), 2, false));
                ConfirmationBottomSheet e7 = e6.e();
                e7.setTargetController(webAppRootScreen);
                uu3 uu33 = webAppRootScreen;
                while (uu33.getParentController() != null) {
                    uu33 = uu33.getParentController();
                }
                foc foc3 = uu33 instanceof foc ? (foc) uu33 : null;
                if (foc3 != null) {
                    znc = foc3.T();
                }
                e7.z0(webAppRootScreen);
                if (znc != null) {
                    coc coc3 = new coc(e7, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc3, true, "BottomSheetWidget");
                    znc.G(coc3);
                }
            } else if (tpa.f(kzf, czf.a)) {
                webAppRootScreen.A0().reload();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
