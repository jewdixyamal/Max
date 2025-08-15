package one.me.sdk.contextmenu.bottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/sdk/contextmenu/bottomsheet/ContextMenuBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lrt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "wt3", "context-menu_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ContextMenuBottomSheet extends BottomSheetWidget implements rt3 {
    public static final /* synthetic */ bc7[] G0;
    public final fs A0;
    public final fs B0;
    public final fs C0;
    public final fs D0;
    public final fs E0;
    public final xxc F0;
    public final fs y0;
    public final fs z0;

    static {
        Class<ContextMenuBottomSheet> cls = ContextMenuBottomSheet.class;
        G0 = new bc7[]{new hob(cls, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), z7b.g(nec.a, cls, "anchorViewId", "getAnchorViewId()Ljava/lang/Integer;", 0), new hob(cls, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), new hob(cls, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), new hob(cls, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), new hob(cls, "parentId", "getParentId()Ljava/lang/Integer;", 0), new oi9(cls, "isCallbackSent", "isCallbackSent()Z")};
    }

    public ContextMenuBottomSheet() {
        this((Bundle) null, 1, (z84) null);
    }

    public final void dismiss() {
        s0(true);
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        kr0 kr0 = new kr0((uu3) this, (k56) new es3(1, this));
        if (getRouter() != null) {
            getRouter().a(kr0);
        } else {
            addLifecycleListener(new o9(this, kr0, 2));
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bc7[] bc7Arr = G0;
        bc7 bc7 = bc7Arr[1];
        Integer num = (Integer) this.z0.a(this);
        if (num != null) {
            int intValue = num.intValue();
            bc7 bc72 = bc7Arr[2];
            Class cls = (Class) this.A0.a(this);
            if (cls != null) {
                cd6 cd6 = new cd6(cls, intValue);
                cd6.g(this);
                fk6 fk6 = new fk6(cd6);
                bc7 bc73 = bc7Arr[3];
                bc7 bc74 = bc7Arr[4];
                bc7 bc75 = bc7Arr[5];
                fk6.a(view, (Rect) this.B0.a(this), (Float) this.C0.a(this), (Integer) this.D0.a(this));
            }
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
        z0(widget);
        if (znc != null) {
            coc coc = new coc(this, (String) null, (zu3) null, (zu3) null, false, -1);
            wg0.l(false, coc, true, "BottomSheetWidget");
            znc.G(coc);
        }
    }

    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = layoutInflater.getContext();
        Bundle bundle = getArgs().getBundle("actions");
        List f = bundle != null ? ay7.f(bundle) : null;
        if (f == null) {
            f = nz4.a;
        }
        jy2 jy2 = new jy2(6, this);
        this.F0.getClass();
        return xxc.i(context, f, jy2);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [xxc, java.lang.Object] */
    public ContextMenuBottomSheet(Bundle bundle) {
        super(bundle);
        this.y0 = new fs(Bundle.class, (Object) null, ApiProtocol.PARAM_PAYLOAD);
        Class<Integer> cls = Integer.class;
        this.z0 = new fs(cls, "anchor_id");
        this.A0 = new fs(Class.class, "anchor_class");
        this.B0 = new fs(Rect.class, "highlight_padding");
        this.C0 = new fs(Float.class, "highlight_radius");
        this.D0 = new fs(cls, "parent_id");
        this.E0 = new fs(Boolean.class, Boolean.FALSE, "callback_sent");
        this.F0 = new Object();
        boolean z = false;
        if (bundle != null) {
            BaseBottomSheetWidget.X.getClass();
            z = bundle.getBoolean(BaseBottomSheetWidget.Z, false);
        }
        v0(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContextMenuBottomSheet(Bundle bundle, int i, z84 z84) {
        this((i & 1) != 0 ? null : bundle);
    }
}
