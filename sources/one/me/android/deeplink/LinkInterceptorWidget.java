package one.me.android.deeplink;

import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/android/deeplink/LinkInterceptorWidget;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Landroid/net/Uri;", "uri", "Lej7;", "result", "(Landroid/net/Uri;Lej7;)V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
public final class LinkInterceptorWidget extends Widget implements ng3 {
    public static final /* synthetic */ int o = 0;
    public final je7 a;
    public final je7 b;
    public final boolean c;

    public LinkInterceptorWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = createViewModelLazy(wj7.class, new nj4(16, new m57(12)));
        this.b = tu0.r(3, new xj7(this, 0));
        this.c = true;
    }

    public final void h(int i, Bundle bundle) {
        ((rg1) this.b.getValue()).g(i);
    }

    public final boolean isDialog() {
        return this.c;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(viewGroup.getContext(), (AttributeSet) null);
        coordinatorLayout.setId(kvb.link_interceptor_widget_view);
        coordinatorLayout.setBackgroundColor(0);
        return coordinatorLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((rg1) this.b.getValue()).b(i, strArr, iArr);
    }

    public final void onViewCreated(View view) {
        i3a onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            eh7 viewLifecycleOwner = getViewLifecycleOwner();
            ru3 ru3 = new ru3(true, (m56) new jy2(25, this));
            if (viewLifecycleOwner != null) {
                onBackPressedDispatcher.a(viewLifecycleOwner, ru3);
            } else {
                onBackPressedDispatcher.b(ru3);
            }
        }
        wj7 wj7 = (wj7) this.a.getValue();
        Uri uri = (Uri) getArgs().getParcelable("uri");
        ej7 ej7 = (ej7) getArgs().getParcelable("link_result");
        wj7.getClass();
        od2.L(new zn5(od2.d0(ej7 != null ? new qn5(3, ej7) : uri == null ? new qn5(3, oi7.a) : ((vj7) wj7.b.getValue()).e(uri), new y03(3, (Continuation) null, 4)), new ak7(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public LinkInterceptorWidget(Uri uri, ej7 ej7) {
        this(dy7.g(new kpa("uri", uri), new kpa("link_result", ej7)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinkInterceptorWidget(Uri uri, ej7 ej7, int i, z84 z84) {
        this(uri, (i & 2) != 0 ? null : ej7);
    }
}
