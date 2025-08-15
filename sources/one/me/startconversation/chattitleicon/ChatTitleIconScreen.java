package one.me.startconversation.chattitleicon;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0010\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/startconversation/chattitleicon/ChatTitleIconScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Lad0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "ids", "Lpyd;", "createType", "([JLpyd;)V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatTitleIconScreen extends Widget implements ng3, ad0 {
    public static final /* synthetic */ bc7[] z0;
    public final glc X;
    public final je7 Y;
    public final je7 Z;
    public final x27 a;
    public final khe b;
    public final fs c;
    public final fs o;
    public final je7 s0;
    public final qm0 t0;
    public final qm0 u0;
    public final qm0 v0;
    public final qm0 w0;
    public final qm0 x0;
    public final qm0 y0;

    static {
        Class<ChatTitleIconScreen> cls = ChatTitleIconScreen.class;
        hob hob = new hob(cls, "ids", "getIds()[J", 0);
        oec oec = nec.a;
        z0 = new bc7[]{hob, zr6.e(oec, cls, "createType", "getCreateType()Lone/me/startconversation/deeplink/StartConversationDeepLinkRoutes$CreateType;", 0), zr6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oec), zr6.f(cls, "hint", "getHint()Landroid/widget/TextView;", 0, oec), zr6.f(cls, "chatIcon", "getChatIcon()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0, oec), zr6.f(cls, "chatTitle", "getChatTitle()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0, oec), zr6.f(cls, "chatDescription", "getChatDescription()Lone/me/sdk/uikit/common/views/DescriptionTextViewWithLimit;", 0, oec), zr6.f(cls, "confirmButton", "getConfirmButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oec)};
    }

    public ChatTitleIconScreen(long[] jArr, pyd pyd) {
        this(dy7.g(new kpa("ids", jArr), new kpa("create_type", pyd)));
    }

    public static final xh4 m0(ChatTitleIconScreen chatTitleIconScreen) {
        chatTitleIconScreen.getClass();
        bc7 bc7 = z0[6];
        return (xh4) chatTitleIconScreen.x0.getValue();
    }

    public static final s5a n0(ChatTitleIconScreen chatTitleIconScreen) {
        chatTitleIconScreen.getClass();
        bc7 bc7 = z0[4];
        return (s5a) chatTitleIconScreen.v0.getValue();
    }

    public final void a(String str, RectF rectF, Rect rect) {
        r0().r(str, rectF, rect);
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    public final bvc getScreenDelegate() {
        return this.X;
    }

    public final void h(int i, Bundle bundle) {
        if (i == zia.b) {
            syd syd = syd.c;
            syd.getClass();
            syd.P1().b(":media-picker/select/photo", (Bundle) null);
        } else if (i == zia.c) {
            r0().s();
        }
    }

    public final cka o0() {
        bc7 bc7 = z0[5];
        return (cka) this.w0.getValue();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 666) {
            if (i == 777 && i2 == -1) {
                ks2 r0 = r0();
                pnf.n(r0, ((w9a) ((kke) r0.Z.getValue())).b(), (vx3) null, new gs2(r0, intent != null ? intent.getData() : null, (Continuation) null), 2);
            }
        } else if (i2 != -1) {
        } else {
            if (intent == null) {
                r0().u();
                return;
            }
            ks2 r02 = r0();
            pnf.n(r02, ((w9a) ((kke) r02.Z.getValue())).b(), (vx3) null, new hs2(intent, r02, (Continuation) null), 2);
        }
    }

    public final void onAttach(View view) {
        mr0.V(o0().a);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        bc7 bc7 = z0[2];
        linearLayout.addView((cla) this.t0.getValue());
        NestedScrollView nestedScrollView = new NestedScrollView(linearLayout.getContext(), (AttributeSet) null);
        nestedScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        nestedScrollView.setFillViewport(true);
        c01 c01 = new c01(1, this);
        ConstraintLayout constraintLayout = new ConstraintLayout(nestedScrollView.getContext());
        constraintLayout.setId(zia.d);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c01.invoke(constraintLayout);
        nestedScrollView.addView(constraintLayout);
        linearLayout.addView(nestedScrollView);
        return linearLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((eua) this.Z.getValue()).b(strArr)) {
            r0().s();
        }
    }

    public final void onViewCreated(View view) {
        w7c w7c = r0().z0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new yr2((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(r0().A0, getViewLifecycleOwner().Q(), fg7), new zr2((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(r0().B0, new bs2((Continuation) null, this), 5), getLifecycleScope());
    }

    public final OneMeButton p0() {
        bc7 bc7 = z0[7];
        return (OneMeButton) this.y0.getValue();
    }

    public final pyd q0() {
        bc7 bc7 = z0[1];
        return (pyd) this.o.a(this);
    }

    public final ks2 r0() {
        return (ks2) this.Y.getValue();
    }

    public ChatTitleIconScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = x27.d;
        this.b = new khe(new hn2(5));
        this.c = new fs(long[].class, new long[0], "ids");
        this.o = new fs(pyd.class, "create_type");
        this.X = new glc(new wr2(this, 1), (k56) null, 6);
        this.Y = createViewModelLazy(ks2.class, new ti2(16, new x2((Object) this, 25, (Object) bundle)));
        nyd nyd = nyd.a;
        this.Z = nyd.getAccessor().d(eua.class);
        this.s0 = nyd.getAccessor().d(an9.class);
        this.t0 = binding(new wr2(this, 2));
        this.u0 = binding(new wr2(this, 3));
        this.v0 = binding(new wr2(this, 4));
        this.w0 = binding(new wr2(this, 5));
        this.x0 = binding(new wr2(this, 6));
        this.y0 = binding(new wr2(this, 7));
    }
}
