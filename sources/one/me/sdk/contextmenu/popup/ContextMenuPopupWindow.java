package one.me.sdk.contextmenu.popup;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/sdk/contextmenu/popup/ContextMenuPopupWindow;", "Lone/me/sdk/arch/Widget;", "Lrt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "re6", "context-menu_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ContextMenuPopupWindow extends Widget implements rt3 {
    public static final /* synthetic */ bc7[] u0;
    public static final int v0 = xwb.context_menu_card_id;
    public final fs X;
    public final fs Y;
    public final fs Z;
    public final fs a;
    public final fs b;
    public final fs c;
    public final fs o;
    public final q7c s0;
    public final fs t0;

    static {
        Class<ContextMenuPopupWindow> cls = ContextMenuPopupWindow.class;
        u0 = new bc7[]{new hob(cls, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), z7b.g(nec.a, cls, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), new hob(cls, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), new hob(cls, "anchorViewId", "getAnchorViewId()I", 0), new hob(cls, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), new hob(cls, "parentViewId", "getParentViewId()Ljava/lang/Integer;", 0), new oi9(cls, "isCallbackSent", "isCallbackSent()Z"), new hob(cls, "cardView", "getCardView()Landroid/view/View;", 0), new hob(cls, "useDarkTheme", "getUseDarkTheme()Z", 0)};
    }

    public ContextMenuPopupWindow() {
        this((Bundle) null, 1, (z84) null);
    }

    public static final fka m0(ContextMenuPopupWindow contextMenuPopupWindow) {
        boolean n0 = contextMenuPopupWindow.n0();
        pq9 pq9 = qp4.u0;
        Context context = contextMenuPopupWindow.getContext();
        return n0 ? pq9.o(context).c : pq9.b(context).i();
    }

    public final void dismiss() {
        getRouter().B(this);
    }

    public final x27 getInsetsConfig() {
        x27 x27 = x27.c;
        return x27.d;
    }

    public final boolean handleBack() {
        dismiss();
        return true;
    }

    public final boolean n0() {
        bc7 bc7 = u0[8];
        return ((Boolean) this.t0.a(this)).booleanValue();
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        kr0 kr0 = new kr0((uu3) this, (k56) new es3(2, this));
        if (getRouter() != null) {
            getRouter().a(kr0);
        } else {
            addLifecycleListener(new o9(this, kr0, 3));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new bu3(this, layoutInflater, layoutInflater.getContext());
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        int G2 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        bc7[] bc7Arr = u0;
        bc7 bc7 = bc7Arr[3];
        int intValue = ((Number) this.o.a(this)).intValue();
        if (intValue != -1) {
            bc7 bc72 = bc7Arr[4];
            cd6 cd6 = new cd6((Class) this.X.a(this), intValue);
            cd6.g(this);
            fk6 fk6 = new fk6(cd6);
            bc7 bc73 = bc7Arr[1];
            bc7 bc74 = bc7Arr[2];
            bc7 bc75 = bc7Arr[5];
            fk6.a(view, (Rect) this.b.a(this), (Float) this.c.a(this), (Integer) this.Y.a(this));
            bc7 bc76 = bc7Arr[7];
            ((ArrayList) cd6.c).add(new rl4(new Rect(), (View) this.s0.T0(this, bc76), view, new Rect(), G, G2));
        }
        float f = getArgs().getFloat("x", -1.0f);
        float f2 = getArgs().getFloat("y", -1.0f);
        View findViewById = view.findViewById(v0);
        if (f > 0.0f && f2 > 0.0f) {
            findViewById.addOnLayoutChangeListener(new n6b(findViewById, f, f2));
        }
    }

    public final void q(Widget widget) {
        setTargetController(widget);
        uu3 uu3 = widget;
        while (uu3.getParentController() != null) {
            uu3 = uu3.getParentController();
        }
        znc znc = null;
        foc foc = uu3 instanceof foc ? (foc) uu3 : null;
        if (foc != null) {
            znc = foc.T();
        }
        if (znc != null) {
            coc coc = new coc(this, (String) null, (zu3) null, (zu3) null, false, -1);
            wg0.l(false, coc, true, "BottomSheetWidget");
            znc.G(coc);
        }
    }

    public ContextMenuPopupWindow(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new fs(Bundle.class, (Object) null, ApiProtocol.PARAM_PAYLOAD);
        this.b = new fs(Rect.class, "highlight_padding");
        this.c = new fs(Float.class, "highlight_radius");
        Class<Integer> cls = Integer.class;
        this.o = new fs(cls, -1, "anchor_id");
        this.X = new fs(Class.class, "anchor_class");
        this.Y = new fs(cls, "parent_id");
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls2 = Boolean.class;
        this.Z = new fs(cls2, bool, "callback_sent");
        this.s0 = viewBinding(v0);
        this.t0 = new fs(cls2, bool, "dark_theme");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContextMenuPopupWindow(Bundle bundle, int i, z84 z84) {
        this((i & 1) != 0 ? null : bundle);
    }
}
