package one.me.chatscreen.chatstatus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chatscreen/chatstatus/ChatStatusBottomWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "Lyq2;", "chatStatus", "(Ljava/lang/String;Lyq2;Lz84;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatStatusBottomWidget extends Widget {
    public static final /* synthetic */ bc7[] c;
    public final je7 a;
    public final q7c b;

    static {
        Class<ChatStatusBottomWidget> cls = ChatStatusBottomWidget.class;
        c = new bc7[]{new oi9(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), z7b.g(nec.a, cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public ChatStatusBottomWidget(String str, yq2 yq2, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("arg_key_chat_status", yq2)));
    }

    public final rq2 m0() {
        return (rq2) this.a.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        v3c.y(new ro2(3, (Continuation) null, 1), frameLayout);
        OneMeButton oneMeButton = new OneMeButton(frameLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(t8a.c);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.c);
        oneMeButton.setAppearance(z6a.c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        float f = (float) 12;
        float f2 = (float) 0;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(layoutParams);
        frameLayout.addView(oneMeButton);
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        od2.L(new zn5(tu0.g(new t03(m0().d1, 11), getViewLifecycleOwner().Q(), fg7.o), new ar2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public ChatStatusBottomWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        fs fsVar = new fs(suc.class, Widget.ARG_SCOPE_ID);
        bc7 bc7 = c[0];
        this.a = m82getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, rq2.class, (k56) null);
        this.b = viewBinding(t8a.c);
    }
}
