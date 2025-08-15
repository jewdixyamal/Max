package one.me.devmenu;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.devmenu.utils.LongValueBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.sections.SectionRecyclerWidget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/devmenu/DevMenuScreen;", "Lone/me/sdk/sections/SectionRecyclerWidget;", "Llfd;", "Lxv7;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class DevMenuScreen extends SectionRecyclerWidget implements lfd, xv7 {
    public static final /* synthetic */ int u0 = 0;
    public final mfd X;
    public final y51 Y;
    public final List Z;
    public final x27 o = x27.d;
    public final je7 s0;
    public final fi9 t0;

    public DevMenuScreen() {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        this.X = new mfd(this, commonPool);
        this.Y = new y51(commonPool, 5);
        fi4 fi4 = fi4.a;
        this.Z = fi4.getAccessor().a(pi4.class);
        this.s0 = fi4.getAccessor().d(ty3.class);
        this.t0 = new fi9();
    }

    public static vfd p0(DevMenuScreen devMenuScreen, b54 b54, int i, int i2, int i3) {
        b54 b542 = b54;
        int i4 = (i3 & 4) != 0 ? b542.c : i2;
        devMenuScreen.getClass();
        hfd hfd = null;
        Integer valueOf = i4 != 0 ? Integer.valueOf(i4) : null;
        y44 y44 = y44.e;
        fp3 fp3 = b542.e;
        if (!tpa.f(fp3, y44)) {
            if (tpa.f(fp3, z44.e)) {
                hfd = cfd.a;
            } else if (fp3 instanceof a54) {
                hfd = new ffd(((a54) fp3).e, true);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new vfd(b542.a, i, b542.b, (jfd) null, (jqe) null, valueOf, hfd, (zed) null, b542.d, 0, (wed) null, 1688);
    }

    public final void X(long j, boolean z) {
        Object obj;
        List<pi4> list = this.Z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (pi4 pi4 : list) {
                Iterator it = ((Iterable) pi4.c().getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((b54) obj).a == j) {
                        break;
                    }
                }
                b54 b54 = (b54) obj;
                if (b54 != null) {
                    pi4.d(b54);
                    return;
                }
            }
        }
    }

    public final x27 getInsetsConfig() {
        return this.o;
    }

    public final void i(long j) {
        znc znc;
        Object obj;
        List<pi4> list = this.Z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (pi4 pi4 : list) {
                Iterator it = ((Iterable) pi4.c().getValue()).iterator();
                while (true) {
                    znc = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((b54) obj).a == j) {
                        break;
                    }
                }
                b54 b54 = (b54) obj;
                if (b54 != null) {
                    if (pi4 instanceof r7d) {
                        bc7[] bc7Arr = BottomSheetWidget.x0;
                        r7d r7d = (r7d) pi4;
                        LongValueBottomSheet longValueBottomSheet = new LongValueBottomSheet(((oyc) r7d.e.getValue()).o(r7d.a, 0), b54.a, r7d.c);
                        longValueBottomSheet.setTargetController(this);
                        uu3 uu3 = this;
                        while (uu3.getParentController() != null) {
                            uu3 = uu3.getParentController();
                        }
                        foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                        if (foc != null) {
                            znc = foc.T();
                        }
                        longValueBottomSheet.z0(this);
                        if (znc != null) {
                            coc coc = new coc(longValueBottomSheet, (String) null, (zu3) null, (zu3) null, false, -1);
                            wg0.l(false, coc, true, "BottomSheetWidget");
                            znc.G(coc);
                            return;
                        }
                        return;
                    }
                    pi4.d(b54);
                    return;
                }
            }
        }
    }

    public final y51 m0() {
        return this.Y;
    }

    public final mfd n0() {
        return this.X;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(zvb.oneme_devmenu_screen_view);
        fm fmVar = new fm(coordinatorLayout.getContext());
        fmVar.setId(zvb.oneme_devmenu_screen_view_appbar);
        fmVar.setElevation(0.0f);
        fmVar.setBackgroundColor(0);
        fmVar.setOutlineProvider((ViewOutlineProvider) null);
        Toolbar toolbar = new Toolbar(fmVar.getContext(), (AttributeSet) null);
        toolbar.setElevation(0.0f);
        toolbar.setId(zvb.oneme_devmenu_screen_view_toolbar);
        toolbar.setLayoutParams(new t53(-1, -2));
        toolbar.setNavigationIcon((Drawable) null);
        toolbar.u(0, 0);
        cla cla = new cla(toolbar.getContext(), 6);
        cla.setForm(uka.a);
        cla.setTextShimmerEnabled(false);
        cla.setId(zvb.oneme_devmenu_screen_view_oneme_toolbar);
        cla.setTitle((CharSequence) "Dev menu");
        cla.setLeftActions(new kka(new pz2(13)));
        toolbar.addView(cla, new jwe(-1));
        fmVar.addView(toolbar, new dm(-1, -2));
        coordinatorLayout.addView(fmVar, new rw3(-1, -2));
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RecyclerView o0 = o0(16);
        rw3 rw3 = new rw3(-1, -1);
        rw3.setMargins(rw3.leftMargin, tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density), rw3.rightMargin, tu0.G(((float) 64) * fk4.d().getDisplayMetrics().density));
        rw3.b(new AppBarLayout$ScrollingViewBehavior(coordinatorLayout.getContext(), (AttributeSet) null));
        coordinatorLayout.addView(o0, rw3);
        v3c.y(new br(3, (Continuation) null, 5), coordinatorLayout);
        return coordinatorLayout;
    }

    public final void onDestroy() {
        super.onDestroy();
        for (pi4 b : this.Z) {
            b.b();
        }
    }

    public final void onDestroyView(View view) {
        this.t0.a();
    }

    public final void onViewCreated(View view) {
        ArrayList arrayList = new ArrayList();
        List list = this.Z;
        for (Object next : list) {
            pi4 pi4 = (pi4) next;
            if ((pi4 instanceof hp7) || (pi4 instanceof e7d) || (pi4 instanceof r7d)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b54 b54 = (b54) x53.i0((List) ((pi4) it.next()).c().getValue());
            if (b54 != null) {
                arrayList2.add(b54);
            }
        }
        List<b54> x0 = x53.x0(arrayList2, new ii4(new bk(8, this), 0));
        ArrayList arrayList3 = new ArrayList(z53.S(x0, 10));
        for (b54 b542 : x0) {
            b54 b543 = (b54) this.t0.f(b542.a, b542);
            if (b543 != null) {
                try {
                    SimilarDevButtonIdsException similarDevButtonIdsException = new SimilarDevButtonIdsException("Button " + ei4.b(b542.a) + "/`" + b542.b.b(getContext()) + "` already added by " + ei4.b(b543.a) + "/`" + b543.b.b(getContext()) + "`");
                    hm9.l("DevMenu", "similar buttons", similarDevButtonIdsException);
                    ((ty3) this.s0.getValue()).a(SimilarDevButtonIdsException.ISSUE_KEY, similarDevButtonIdsException);
                } catch (Throwable unused) {
                }
                wha wha = (wha) fi4.a.getAccessor().c(wha.class);
                wha.h("❗️ Дев меню невалидно, есть одинаковые id");
                wha.i();
            }
            int i = b542.c;
            if (i == 0) {
                i = yfa.s;
            }
            arrayList3.add(p0(this, b542, 0, i, 2));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object next2 : list) {
            pi4 pi42 = (pi4) next2;
            if (!(pi42 instanceof hp7) && !(pi42 instanceof e7d) && !(pi42 instanceof r7d)) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(z53.S(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Object next3 = it2.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList5.add(new ni4(((pi4) next3).c(), this, i2));
                i2 = i3;
            } else {
                y53.R();
                throw null;
            }
        }
        od2.L(new zn5(new ki4((mn5[]) x53.D0(arrayList5).toArray(new mn5[0]), 0), new li4(this, arrayList3, (Continuation) null), 5), getLifecycleScope());
    }
}
