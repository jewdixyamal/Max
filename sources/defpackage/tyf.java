package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Collections;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: tyf  reason: default package */
public final /* synthetic */ class tyf implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebAppRootScreen b;

    public /* synthetic */ tyf(WebAppRootScreen webAppRootScreen, int i) {
        this.a = i;
        this.b = webAppRootScreen;
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [fxc, android.view.View, hla, android.webkit.WebView] */
    public final Object invoke(Object obj) {
        WebAppRootScreen webAppRootScreen = this.b;
        e5f e5f = e5f.a;
        switch (this.a) {
            case 0:
                e5f e5f2 = e5f;
                bc7[] bc7Arr = WebAppRootScreen.G0;
                dy7.c(1).Y((View) obj).I(Collections.singletonList(new tt3(1, (jqe) new eqe(x1c.web_app_root_dots_menu_refresh), Integer.valueOf(gpc.a0), (Integer) null, 20))).build().q(webAppRootScreen);
                return e5f2;
            case 1:
                LinearLayout linearLayout = (LinearLayout) obj;
                bc7[] bc7Arr2 = WebAppRootScreen.G0;
                cla cla = new cla(linearLayout.getContext(), 6);
                cla.setId(kla.i);
                cla.setForm(uka.a);
                WebAppRootScreen webAppRootScreen2 = this.b;
                cla.setRightActions(new rka(new tyf(webAppRootScreen2, 0)));
                linearLayout.addView(cla);
                FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
                frameLayout.setId(kla.a);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                Context context = frameLayout.getContext();
                ? hla = new hla(context, (AttributeSet) null, 16842885, 8);
                hla.setId(kla.j);
                hla.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                hla.getSettings().setJavaScriptEnabled(true);
                hla.getSettings().setDomStorageEnabled(true);
                hla.getSettings().setSupportMultipleWindows(true);
                hla.setWebViewClient(new jla(webAppRootScreen2.z0(), new s23(context)));
                hla.setWebChromeClient(new gla(webAppRootScreen2.z0()));
                hla.addJavascriptInterface(new u3g(webAppRootScreen2.z0()), "WebViewHandler");
                nfa nfa = new nfa(frameLayout.getContext());
                nfa.setId(kla.d);
                nfa.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                nfa.setAppearance(cfa.a);
                Context context2 = frameLayout.getContext();
                LinearLayout linearLayout2 = new LinearLayout(context2);
                linearLayout2.setId(kla.b);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
                float f = (float) 20;
                layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
                layoutParams.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
                linearLayout2.setLayoutParams(layoutParams);
                linearLayout2.setOrientation(1);
                Drawable b2 = kt3.b(linearLayout2.getContext(), woc.v0);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(b2);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 1;
                imageView.setLayoutParams(layoutParams2);
                TextView textView = new TextView(context2);
                textView.setText(x1c.web_app_root_error_title);
                textView.setSingleLine();
                i4f.d.b(textView, du4.b);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 1;
                layoutParams3.topMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                textView.setLayoutParams(layoutParams3);
                TextView textView2 = new TextView(context2);
                textView2.setText(x1c.web_app_root_error_subtitle);
                textView2.setSingleLine();
                i4f.n.b(textView2, du4.b);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.topMargin = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
                layoutParams4.bottomMargin = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
                layoutParams4.gravity = 1;
                textView2.setLayoutParams(layoutParams4);
                OneMeButton oneMeButton = new OneMeButton(context2, (AttributeSet) null);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 1;
                oneMeButton.setLayoutParams(layoutParams5);
                oneMeButton.setText(x1c.web_app_root_error_retry_button);
                oneMeButton.setMode(b7a.b);
                oneMeButton.setAppearance(z6a.o);
                tu0.K(oneMeButton, 300, new elb(17, (Object) webAppRootScreen2));
                e5f e5f3 = e5f;
                LinearLayout linearLayout3 = linearLayout2;
                v3c.y(new jf1(textView, textView2, b2, (Continuation) null, 7), linearLayout3);
                linearLayout3.addView(imageView);
                linearLayout3.addView(textView);
                linearLayout3.addView(textView2);
                linearLayout3.addView(oneMeButton);
                frameLayout.addView(hla);
                i24.s(new zn5(webAppRootScreen2.z0().L0, new uyf(webAppRootScreen2, hla, frameLayout, linearLayout3, nfa, (Continuation) null), 5), webAppRootScreen2.getViewLifecycleScope());
                linearLayout.addView(frameLayout);
                return e5f3;
            case 2:
                View view = (View) obj;
                bc7[] bc7Arr3 = WebAppRootScreen.G0;
                c8d c8d = webAppRootScreen.z0().D0;
                c8d.getClass();
                j47.T((sx3) c8d.a, (lx3) null, (vx3) null, new da7(c8d, (Continuation) null), 3);
                return e5f;
            default:
                View view2 = (View) obj;
                bc7[] bc7Arr4 = WebAppRootScreen.G0;
                zzf z0 = webAppRootScreen.z0();
                z0.getClass();
                pnf.n(z0, (lx3) null, (vx3) null, new pzf(z0, (Continuation) null), 3);
                return e5f;
        }
    }
}
