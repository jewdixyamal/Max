package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.messages.location.FrgLocationMap;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B9\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/FragmentWrapperWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "", "fragmentId", "Ljava/lang/Class;", "Landroidx/fragment/app/a;", "fragmentClass", "", "fragmentTag", "Landroid/os/Bundle;", "args", "(ILjava/lang/Class;Ljava/lang/String;Landroid/os/Bundle;)V", "arch_release"}, k = 1, mv = {2, 0, 0})
public final class FragmentWrapperWidget extends Widget {
    public static final /* synthetic */ bc7[] X;
    public final fs a;
    public final fs b;
    public final fs c;
    public final fs o;

    static {
        Class<FragmentWrapperWidget> cls = FragmentWrapperWidget.class;
        X = new bc7[]{new oi9(cls, "fragmentId", "getFragmentId()I"), rh4.g(nec.a, cls, "fragmentClass", "getFragmentClass()Ljava/lang/String;"), new oi9(cls, "fragmentTag", "getFragmentTag()Ljava/lang/String;"), new oi9(cls, "fragmentArgs", "getFragmentArgs()Landroid/os/Bundle;")};
    }

    public FragmentWrapperWidget() {
        super((Bundle) null, 0, 3, (z84) null);
        this.a = new fs(Integer.class, "widget:fragment:id");
        Class<String> cls = String.class;
        this.b = new fs(cls, ":widget:fragment:class");
        this.c = new fs(cls, "widget:fragment:tag");
        this.o = new fs(Bundle.class, "widget:fragment:args");
    }

    public final x27 getInsetsConfig() {
        x27 x27 = x27.c;
        return x27.d;
    }

    public final n16 m0() {
        Activity activity = getActivity();
        im imVar = activity instanceof im ? (im) activity : null;
        if (imVar != null) {
            return imVar.S();
        }
        return null;
    }

    public final a n0() {
        n16 m0 = m0();
        if (m0 == null) {
            return null;
        }
        bc7 bc7 = X[0];
        return m0.D(((Number) this.a.a(this)).intValue());
    }

    public final void onAttach(View view) {
        a n0 = n0();
        if (n0 != null) {
            n0.u0(getContext());
        }
    }

    public final void onChangeEnded(zu3 zu3, av3 av3) {
        n16 m0;
        a n0;
        if (!av3.b && (m0 = m0()) != null && (n0 = n0()) != null) {
            he0 he0 = new he0(m0);
            he0.h(n0);
            he0.d(true);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object obj;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        bc7[] bc7Arr = X;
        bc7 bc7 = bc7Arr[0];
        frameLayout.setId(((Number) this.a.a(this)).intValue());
        n16 m0 = m0();
        if (m0 == null) {
            return frameLayout;
        }
        a D = m0.D(frameLayout.getId());
        bc7 bc72 = bc7Arr[1];
        String str = (String) this.b.a(this);
        y16 y16 = null;
        if (D == null) {
            f16 J = m0.J();
            frameLayout.getContext().getClassLoader();
            D = J.a(str);
            int i = D.J0;
            D.J0 = i;
            D.K0 = i;
            D.L0 = D.L0;
            D.F0 = m0;
            D.G0 = m0.w;
            bc7 bc73 = bc7Arr[3];
            D.X0((Bundle) this.o.a(this));
            frameLayout.getContext();
            D.F0((AttributeSet) null, bundle);
            he0 he0 = new he0(m0);
            he0.o = true;
            bc7 bc74 = bc7Arr[2];
            D.T0 = frameLayout;
            D.B0 = true;
            he0.f(frameLayout.getId(), D, (String) this.c.a(this), 1);
            if (!he0.g) {
                he0.q.B(he0, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        FrgLocationMap frgLocationMap = D instanceof FrgLocationMap ? (FrgLocationMap) D : null;
        if (frgLocationMap != null) {
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
            if (uu3 instanceof y16) {
                y16 = (y16) uu3;
            }
            frgLocationMap.B1 = y16;
        }
        View view = D.U0;
        if (view != null && view.getParent() == null) {
            D.T0 = frameLayout;
            e g = m0.g(D);
            g.b();
            g.k();
        }
        return frameLayout;
    }

    public final void onDestroy() {
        a n0 = n0();
        if (n0 != null) {
            n0.y0();
        }
    }

    public final void onDestroyView(View view) {
        a n0 = n0();
        if (n0 != null) {
            n0.z0();
        }
    }

    public final void onDetach(View view) {
        a n0 = n0();
        if (n0 != null) {
            n0.A0();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentWrapperWidget(int i, Class cls, String str, Bundle bundle, int i2, z84 z84) {
        this(i, cls, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : bundle);
    }

    public FragmentWrapperWidget(int i, Class<? extends a> cls, String str, Bundle bundle) {
        this();
        bc7[] bc7Arr = X;
        bc7 bc7 = bc7Arr[0];
        this.a.b(this, Integer.valueOf(i));
        String name = cls.getName();
        bc7 bc72 = bc7Arr[1];
        this.b.b(this, name);
        bc7 bc73 = bc7Arr[2];
        this.c.b(this, str);
        bc7 bc74 = bc7Arr[3];
        this.o.b(this, bundle);
    }
}
