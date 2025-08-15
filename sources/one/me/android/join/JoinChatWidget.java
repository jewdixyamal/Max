package one.me.android.join;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.android.deeplink.LinkInterceptorActivity;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/android/join/JoinChatWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "link", "title", "", "isChannel", "(JLjava/lang/String;Ljava/lang/String;Z)V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
public final class JoinChatWidget extends BaseBottomSheetWidget {
    public static final String A0 = "join:title";
    public static final String B0 = "join:channel";
    public static final /* synthetic */ bc7[] x0;
    public static final String y0 = "join:id";
    public static final String z0 = "join:link";
    public final fs s0;
    public final fs t0;
    public final fs u0;
    public final je7 v0;
    public final boolean w0;

    static {
        Class<JoinChatWidget> cls = JoinChatWidget.class;
        hob hob = new hob(cls, "id", "getId()J", 0);
        oec oec = nec.a;
        x0 = new bc7[]{hob, zr6.e(oec, cls, "link", "getLink()Ljava/lang/String;", 0), zr6.f(cls, "title", "getTitle()Ljava/lang/String;", 0, oec), zr6.f(cls, "isChannel", "isChannel()Z", 0, oec)};
    }

    public JoinChatWidget(Bundle bundle) {
        super(bundle);
        Class<String> cls = String.class;
        this.s0 = new fs(cls, z0);
        this.t0 = new fs(cls, (Object) null, A0);
        this.u0 = new fs(Boolean.class, B0);
        je7 createViewModelLazy = createViewModelLazy(n97.class, new nj4(13, new es3(29, this)));
        this.v0 = createViewModelLazy;
        this.w0 = true;
        od2.L(new zn5(new t03(tu0.g(((n97) createViewModelLazy.getValue()).X, this.lifecycleOwner.Q(), fg7.o), 19), new d97(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final boolean isDialog() {
        return this.w0;
    }

    public final void onViewCreated(View view) {
        i3a onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            eh7 viewLifecycleOwner = getViewLifecycleOwner();
            ru3 ru3 = new ru3(true, (m56) new jy2(22, this));
            if (viewLifecycleOwner != null) {
                onBackPressedDispatcher.a(viewLifecycleOwner, ru3);
            } else {
                onBackPressedDispatcher.b(ru3);
            }
        }
        getRouter().I();
    }

    public final void t0() {
        super.t0();
        Activity d = getRouter().d();
        LinkInterceptorActivity linkInterceptorActivity = d instanceof LinkInterceptorActivity ? (LinkInterceptorActivity) d : null;
        if (linkInterceptorActivity != null) {
            linkInterceptorActivity.finish();
        }
    }

    public final void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        String str;
        int G = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
        float f = (float) 12;
        frameLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), G, tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f2 = (float) 16;
        textView.setPaddingRelative(textView.getPaddingStart(), tu0.G(f2 * fk4.d().getDisplayMetrics().density), textView.getPaddingEnd(), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        bc7[] bc7Arr = x0;
        bc7 bc7 = bc7Arr[3];
        fs fsVar = this.u0;
        boolean booleanValue = ((Boolean) fsVar.a(this)).booleanValue();
        fs fsVar2 = this.t0;
        if (booleanValue) {
            Context context = textView.getContext();
            int i = yzb.join_chat_title_channel;
            bc7 bc72 = bc7Arr[2];
            str = context.getString(i, new Object[]{(String) fsVar2.a(this)});
        } else {
            Context context2 = textView.getContext();
            int i2 = yzb.join_chat_title_chat;
            bc7 bc73 = bc7Arr[2];
            str = context2.getString(i2, new Object[]{(String) fsVar2.a(this)});
        }
        textView.setText(str);
        i4f.c.b(textView, du4.b);
        v3c.y(new v9(3, (Continuation) null, 16), textView);
        linearLayout.addView(textView);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        c7a c7a = c7a.c;
        oneMeButton.setSize(c7a);
        b7a b7a = b7a.o;
        oneMeButton.setMode(b7a);
        z6a z6a = z6a.c;
        oneMeButton.setAppearance(z6a);
        bc7 bc74 = bc7Arr[3];
        oneMeButton.setText((CharSequence) z7.B(oneMeButton.getContext(), ((Boolean) fsVar.a(this)).booleanValue() ? yzb.join_chat_confirm_channel_button : yzb.join_chat_confirm_chat_button));
        tu0.K(oneMeButton, 300, new vu5(oneMeButton, 8, this));
        linearLayout.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton2.setSize(c7a);
        oneMeButton2.setMode(b7a);
        oneMeButton2.setAppearance(z6a);
        oneMeButton2.setText(yzb.join_chat_cancel_button);
        tu0.K(oneMeButton2, 300, new xx5(8, this));
        linearLayout.addView(oneMeButton2);
        frameLayout.addView(linearLayout, -1, -2);
        yp4 yp4 = new yp4(frameLayout.getContext());
        yp4.setTranslationY((float) rh4.c((float) 6, fk4.d().getDisplayMetrics().density, -G));
        frameLayout.addView(yp4);
    }

    public JoinChatWidget(long j, String str, String str2, boolean z) {
        this(dy7.g(new kpa(y0, Long.valueOf(j)), new kpa(z0, str), new kpa(A0, str2), new kpa(B0, Boolean.valueOf(z))));
    }
}
