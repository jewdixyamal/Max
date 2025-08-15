package one.me.chats.picker.chats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006BO\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lone/me/chats/picker/chats/PickerChatsListWidget;", "Lone/me/sdk/arch/Widget;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "Lsuc;", "scopeId", "Loa2;", "filter", "", "isFakeChatsEnabled", "isInMultiSelect", "Lkotlin/Function1;", "Le5f;", "onMultiSelectToggled", "(Ljava/lang/String;Ljava/lang/String;Loa2;ZZLm56;Lz84;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PickerChatsListWidget extends Widget {
    public static final /* synthetic */ bc7[] C0;
    public final qm0 A0;
    public final je7 B0;
    public final fs X;
    public final m56 Y;
    public final je7 Z;
    public final je7 a;
    public final String b;
    public final fs c;
    public final fs o;
    public dle s0;
    public final ExecutorService t0;
    public b u0;
    public final y51 v0;
    public final nd3 w0;
    public final nxa x0;
    public final nxa y0;
    public final qm0 z0;

    static {
        Class<PickerChatsListWidget> cls = PickerChatsListWidget.class;
        C0 = new bc7[]{new hob(cls, "itemsFilter", "getItemsFilter()Lone/me/chats/list/loader/ChatFilterEnum;", 0), z7b.g(nec.a, cls, "isFakeChatsEnabled", "isFakeChatsEnabled()Z", 0), new oi9(cls, "isInMultiSelect", "isInMultiSelect()Z"), new hob(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    }

    public PickerChatsListWidget(String str, String str2, oa2 oa2, boolean z, boolean z2, m56 m56, z84 z84) {
        this(dy7.g(new kpa("folder.id.key", str), new kpa("scope.id", new suc(str2)), new kpa("picker.filter", oa2), new kpa("folder.fake.enabled", Boolean.valueOf(z)), new kpa("is_in_multiselect", Boolean.valueOf(z2))));
        this.Y = m56;
    }

    public static final boolean m0(PickerChatsListWidget pickerChatsListWidget, int i) {
        return i < 0 || i >= pickerChatsListWidget.w0.j() || !tpa.f(pickerChatsListWidget.w0.D(i).first, pickerChatsListWidget.v0);
    }

    public static final boolean n0(PickerChatsListWidget pickerChatsListWidget) {
        List C = pickerChatsListWidget.w0.C();
        if (!C.isEmpty()) {
            Iterator it = C.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((hdc) it.next()) == pickerChatsListWidget.y0) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return ((Boolean) pickerChatsListWidget.q0().z0.a.getValue()).booleanValue();
    }

    public final txa o0() {
        return (txa) this.a.getValue();
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        q0e q0e = q0().C0;
        q0e.m((Object) null, Long.valueOf(((Number) q0e.getValue()).longValue() + 1));
    }

    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        if (tpa.f(this.b, "all.chat.folder")) {
            od2.L(new zn5(o0().u0, new lq0(2, q0(), eya.class, "search", "search$chats_list_release(Ljava/lang/String;)V", 4, 26), 5), getLifecycleScope());
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!tpa.f(this.b, "all.chat.folder")) {
            return p0();
        }
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(p0());
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        EndlessRecyclerView2 p0 = p0();
        dle dle = this.s0;
        if (dle != null) {
            dle.B(p0);
        }
        p0.setDelegate((v15) null);
        p0.setPager((t15) null);
        p0.setAdapter((hdc) null);
    }

    public final void onViewCreated(View view) {
        nd3 nd3 = this.w0;
        od3 od3 = nd3.o;
        nxa nxa = this.x0;
        od3.a(0, nxa);
        EndlessRecyclerView2 p0 = p0();
        p0.getContext();
        p0.setLayoutManager(new LinearLayoutManager());
        p0.setAdapter(nd3);
        this.s0 = z7.m(p0);
        p0.setPager(new j81(this, 6));
        p0.setDelegate(this.v0);
        p0.setClipToPadding(false);
        float f = (float) 6;
        p0.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        p0.setThreshold(10);
        p0.setIgnoreRefreshingFlagsForScrollEvent(true);
        b bVar = this.u0;
        if (bVar != null) {
            p0.setRecycledViewPool(bVar);
        }
        p0.setItemAnimator((mdc) null);
        mdc itemAnimator = p0.getItemAnimator();
        yb4 yb4 = itemAnimator instanceof yb4 ? (yb4) itemAnimator : null;
        if (yb4 != null) {
            yb4.g = false;
        }
        bc7 bc7 = C0[2];
        boolean booleanValue = ((Boolean) this.X.a(this)).booleanValue();
        je7 je7 = this.B0;
        if (booleanValue) {
            p0.j((c03) je7.getValue());
        } else {
            p0.p0((c03) je7.getValue());
        }
        p0.l(new w54(p0));
        if (nxa.j() > 0) {
            p0.measure(View.MeasureSpec.makeMeasureSpec(p0.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(p0.getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
            mdc itemAnimator2 = p0.getItemAnimator();
            if (itemAnimator2 != null) {
                itemAnimator2.e();
            }
        }
        p0().setRefreshingNext(((Boolean) q0().z0.a.getValue()).booleanValue());
        w7c w7c = q0().x0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new iya((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(q0().B0, getViewLifecycleOwner().Q(), fg7), new jya((Continuation) null, this, view), 5), getViewLifecycleScope());
        od2.L(new zn5(o0().Z, new kya((Continuation) null, this), 5), getViewLifecycleScope());
        if (tpa.f(this.b, "all.chat.folder")) {
            od2.L(new zn5(o0().u0, new lya((Continuation) null, this), 5), getViewLifecycleScope());
        }
    }

    public final EndlessRecyclerView2 p0() {
        bc7 bc7 = C0[3];
        return (EndlessRecyclerView2) this.A0.getValue();
    }

    public final eya q0() {
        return (eya) this.Z.getValue();
    }

    public PickerChatsListWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        Class<suc> cls = suc.class;
        Object v = ay7.v(bundle, "scope.id", cls);
        if (v != null) {
            this.a = m82getSharedViewModelcp94BC8(((suc) ((Parcelable) v)).a, txa.class, (k56) null);
            String string = bundle.getString("folder.id.key");
            if (string != null) {
                this.b = string;
                this.c = new fs(oa2.class, "picker.filter");
                Class<Boolean> cls2 = Boolean.class;
                this.o = new fs(cls2, "folder.fake.enabled");
                this.X = new fs(cls2, Boolean.TRUE, "is_in_multiselect");
                this.Z = createViewModelLazy(eya.class, new jp8(9, new fya(this, 0)));
                ExecutorService a2 = ys2.a.c().a();
                this.t0 = a2;
                y51 y51 = new y51(a2, 1);
                this.v0 = y51;
                this.w0 = new nd3(new md3(false, 1), y51);
                hya hya = new hya(this);
                this.x0 = new nxa(hya, a2, 0);
                this.y0 = new nxa(hya, a2, 0);
                this.z0 = binding(new fya(this, 1));
                this.A0 = binding(new fya(this, 2));
                this.B0 = tu0.r(3, new fya(this, 3));
                q0().c.e();
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key scope.id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PickerChatsListWidget(String str, String str2, oa2 oa2, boolean z, boolean z2, m56 m56, int i, z84 z84) {
        this(str, str2, (i & 4) != 0 ? oa2.a : oa2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : m56, (z84) null);
    }
}
