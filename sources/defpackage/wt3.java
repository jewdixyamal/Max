package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: wt3  reason: default package */
public final class wt3 implements qt3 {
    public final Bundle a = new Bundle();

    public final qt3 I(Collection collection) {
        this.a.putBundle("actions", ay7.e(collection));
        return this;
    }

    public final qt3 R(float f) {
        Rect rect = fk6.b;
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    public final qt3 S(Bundle bundle) {
        this.a.putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        return this;
    }

    public final qt3 Y(View view) {
        if (view.getId() != -1) {
            int id = view.getId();
            Bundle bundle = this.a;
            bundle.putInt("anchor_id", id);
            bundle.putSerializable("anchor_class", view.getClass());
            return this;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final rt3 build() {
        return new ContextMenuBottomSheet(new Bundle(this.a));
    }

    public final qt3 d0() {
        nd2 nd2 = BaseBottomSheetWidget.X;
        bc7[] bc7Arr = ContextMenuBottomSheet.G0;
        BaseBottomSheetWidget.X.getClass();
        this.a.putBoolean(BaseBottomSheetWidget.Z, true);
        return this;
    }

    public final qt3 r() {
        Rect rect = fk6.b;
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.remove("highlight_radius");
        return this;
    }

    public final qt3 s() {
        Bundle bundle = this.a;
        bundle.remove("highlight_padding");
        bundle.remove("highlight_radius");
        return this;
    }

    public final qt3 w(Rect rect, float f) {
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }
}
