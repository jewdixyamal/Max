package one.me.sdk.arch;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u0001\b&\u0018\u0000 ª\u00012\u00020\u0001:\u0002«\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0015¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0015¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0015¢\u0006\u0004\b,\u0010+J5\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001\"\n\b\u0000\u0010.\u0018\u0001*\u00020-2\u000e\b\b\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H\bø\u0001\u0000¢\u0006\u0004\b2\u00103J?\u00109\u001a\b\u0012\u0004\u0012\u00028\u000001\"\n\b\u0000\u0010.\u0018\u0001*\u00020-2\u0006\u00105\u001a\u0002042\u0010\b\n\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010/H\bø\u0001\u0000¢\u0006\u0004\b7\u00108J;\u0010>\u001a\b\u0012\u0004\u0012\u00028\u000001\"\b\b\u0000\u0010.*\u00020-2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0/H\u0001¢\u0006\u0004\b>\u0010?JG\u0010B\u001a\b\u0012\u0004\u0012\u00028\u000001\"\b\b\u0000\u0010.*\u00020-2\u0006\u00105\u001a\u0002042\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010/H\u0001¢\u0006\u0004\b@\u0010AJ%\u0010E\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010C*\u00020\u000b2\b\b\u0001\u0010D\u001a\u00020\u0004H\u0004¢\u0006\u0004\bE\u0010FJ/\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000H\"\b\b\u0000\u0010G*\u00020\u000b2\b\b\u0001\u0010D\u001a\u00020\u0004H\u0004¢\u0006\u0004\bI\u0010JJ-\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000M\"\b\b\u0000\u0010G*\u00020K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0004¢\u0006\u0004\bN\u0010OJ=\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020R0H2\b\b\u0001\u0010P\u001a\u00020\u00042\u0016\b\u0002\u0010S\u001a\u0010\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u0012\u0018\u00010QH\u0004¢\u0006\u0004\bT\u0010UJ%\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020V0H2\b\b\u0001\u0010P\u001a\u00020\u0004H\u0004¢\u0006\u0004\bW\u0010JJS\u0010^\u001a\u00020\u0012\"\u0004\b\u0000\u0010G*\b\u0012\u0004\u0012\u00028\u00000X2\b\b\u0002\u0010Z\u001a\u00020Y2$\b\u0004\u0010]\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\\\u0012\u0006\u0012\u0004\u0018\u00010K0[H\bø\u0001\u0000¢\u0006\u0004\b^\u0010_J.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000c\"\u0006\b\u0000\u0010G\u0018\u00012\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00028\u0000H\b¢\u0006\u0004\b\u0003\u0010dJ&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000c\"\u0006\b\u0000\u0010G\u0018\u00012\u0006\u0010a\u001a\u00020`H\b¢\u0006\u0004\b\u0003\u0010eJ)\u0010g\u001a\u00020\u00122\u0014\b\u0004\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120QH\bø\u0001\u0000¢\u0006\u0004\bg\u0010hJ\u000f\u0010j\u001a\u0004\u0018\u00010i¢\u0006\u0004\bj\u0010kJ\u0019\u0010n\u001a\u0004\u0018\u00010\u00002\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010p\u001a\u00020\u00122\u0006\u0010o\u001a\u00020\u0001H\u0002¢\u0006\u0004\bp\u0010qR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010rR\u001a\u0010t\u001a\u00020s8\u0000X\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR&\u0010z\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020y0x8\u0000X\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u001b\u00105\u001a\u0002048\u0016X\u0004¢\u0006\r\n\u0004\b5\u0010~\u001a\u0005\b\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0016XD¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020`8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010~R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00020i8BX\u0002¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010kR\u0015\u0010\u0001\u001a\u00030\u00018F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0015\u0010£\u0001\u001a\u00030 \u00018F¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0015\u0010§\u0001\u001a\u00030¤\u00018F¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0015\u0010©\u0001\u001a\u00030 \u00018F¢\u0006\b\u001a\u0006\b¨\u0001\u0010¢\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006¬\u0001"}, d2 = {"Lone/me/sdk/arch/Widget;", "Luu3;", "Landroid/os/Bundle;", "args", "", "layoutRes", "<init>", "(Landroid/os/Bundle;I)V", "Lim;", "requireActivity", "()Lim;", "Landroid/view/View;", "requireView", "()Landroid/view/View;", "Landroid/content/res/Resources;", "requireResources", "()Landroid/content/res/Resources;", "newArgs", "Le5f;", "updateArgs", "(Landroid/os/Bundle;)V", "oldArgs", "onUpdateArgs", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedViewState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;)V", "Lzu3;", "changeHandler", "Lav3;", "changeType", "onChangeStarted", "(Lzu3;Lav3;)V", "Landroid/app/Activity;", "activity", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "Lpnf;", "VM", "Lkotlin/Function0;", "vmProducer", "Lje7;", "viewModel", "(Lk56;)Lje7;", "Lsuc;", "scopeId", "defaultFactory", "sharedViewModel-qk3jasM", "(Ljava/lang/String;Lk56;)Lje7;", "sharedViewModel", "Ljava/lang/Class;", "viewModelClass", "Lonf;", "factoryProducer", "createViewModelLazy", "(Ljava/lang/Class;Lk56;)Lje7;", "getSharedViewModel-cp94BC8", "(Ljava/lang/String;Ljava/lang/Class;Lk56;)Lje7;", "getSharedViewModel", "V", "id", "findViewById", "(I)Landroid/view/View;", "T", "Lq7c;", "viewBinding", "(I)Lq7c;", "", "bindAction", "Lqm0;", "binding", "(Lk56;)Lqm0;", "containerId", "Lkotlin/Function1;", "Lznc;", "routerBuilder", "childRouter", "(ILm56;)Lq7c;", "Lj03;", "childSlotRouter", "Lmn5;", "Lfg7;", "minActiveState", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "collectInViewScope", "(Lmn5;Lfg7;La66;)V", "", "key", "defaultValue", "Lfs;", "(Ljava/lang/String;Ljava/lang/Object;)Lfs;", "(Ljava/lang/String;)Lfs;", "action", "doActionIfRootExist", "(Lm56;)V", "Lw12;", "addIfNeedChildWidgetContainer", "()Lw12;", "findWidgetByScopeId-iP7A0G4", "(Ljava/lang/String;)Lone/me/sdk/arch/Widget;", "findWidgetByScopeId", "controller", "finalizeCleanActions", "(Luu3;)V", "I", "Lw5g;", "viewModelStore", "Lw5g;", "getViewModelStore$arch_release", "()Lw5g;", "Lqi9;", "Ll23;", "cleanActions", "Lqi9;", "getCleanActions$arch_release", "()Lqi9;", "Ljava/lang/String;", "getScopeId-IluPPks", "()Ljava/lang/String;", "Lx27;", "insetsConfig", "Lx27;", "getInsetsConfig", "()Lx27;", "Lbvc;", "screenDelegate", "Lbvc;", "getScreenDelegate", "()Lbvc;", "", "isDialog", "Z", "()Z", "tag", "i5g", "internalLifecycleListener", "Li5g;", "Lgv3;", "_viewLifecycleOwner", "Lgv3;", "get_viewLifecycleOwner$annotations", "()V", "childWidgetContainer$delegate", "Lje7;", "getChildWidgetContainer", "childWidgetContainer", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lpg7;", "getLifecycleScope", "()Lpg7;", "lifecycleScope", "Leh7;", "getViewLifecycleOwner", "()Leh7;", "viewLifecycleOwner", "getViewLifecycleScope", "viewLifecycleScope", "Companion", "c5g", "arch_release"}, k = 1, mv = {2, 0, 0})
public abstract class Widget extends uu3 {
    public static final String ARG_SCOPE_ID = "arg_key_scope_id";
    public static final c5g Companion = new Object();
    private static final AtomicInteger allocationsCount = new AtomicInteger(0);
    private gv3 _viewLifecycleOwner;
    private final je7 childWidgetContainer$delegate;
    private final qi9 cleanActions;
    private final x27 insetsConfig;
    private final i5g internalLifecycleListener;
    private final boolean isDialog;
    private final int layoutRes;
    private final String scopeId;
    private final bvc screenDelegate;
    /* access modifiers changed from: private */
    public final String tag;
    private final w5g viewModelStore;

    public Widget() {
        this((Bundle) null, 0, 3, (z84) null);
    }

    /* access modifiers changed from: private */
    public static final Object binding$lambda$8(k56 k56, Object obj) {
        return k56.invoke();
    }

    /* access modifiers changed from: private */
    public static final e5f binding$lambda$9(Widget widget, Object obj, l23 l23) {
        qi9 qi9 = widget.cleanActions;
        int e = qi9.e(obj);
        if (e < 0) {
            e = ~e;
        }
        Object[] objArr = qi9.c;
        Object obj2 = objArr[e];
        qi9.b[e] = obj;
        objArr[e] = l23;
        return e5f.a;
    }

    public static /* synthetic */ q7c childRouter$default(Widget widget, int i, m56 m56, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                m56 = null;
            }
            return widget.childRouter(i, m56);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: childRouter");
    }

    /* access modifiers changed from: private */
    public static final znc childRouter$lambda$10(Widget widget, int i, m56 m56, znc znc) {
        ViewGroup viewGroup = (ViewGroup) widget.requireView().findViewById(i);
        if (m56 == null) {
            return widget.getChildRouter(viewGroup);
        }
        znc childRouter = widget.getChildRouter(viewGroup);
        m56.invoke(childRouter);
        return childRouter;
    }

    /* access modifiers changed from: private */
    public static final j03 childSlotRouter$lambda$11(Widget widget, int i, j03 j03) {
        return new j03(widget.getChildRouter((ViewGroup) widget.requireView().findViewById(i)));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.FrameLayout, android.view.View, w12] */
    /* access modifiers changed from: private */
    public static final w12 childWidgetContainer_delegate$lambda$13(Widget widget) {
        ? frameLayout = new FrameLayout(widget.getContext());
        frameLayout.setId(swb.arch_child_widget_wrapper_id);
        return frameLayout;
    }

    public static void collectInViewScope$default(Widget widget, mn5 mn5, fg7 fg7, a66 a66, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                fg7 = fg7.o;
            }
            od2.L(new zn5(tu0.g(mn5, widget.getViewLifecycleOwner().Q(), fg7), new g5g(a66, (Continuation) null), 5), widget.getViewLifecycleScope());
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectInViewScope");
    }

    /* access modifiers changed from: private */
    public final void finalizeCleanActions(uu3 uu3) {
        long[] jArr;
        long[] jArr2;
        int i;
        if (!this.cleanActions.h()) {
            String w = v3c.w(uu3);
            ir6 ir6 = hm9.m;
            Object obj = null;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, w, zr6.h(getCleanActions$arch_release().e, "view detached, call onFinalize for clean actions "), (Throwable) null);
            }
            qi9 qi9 = this.cleanActions;
            Object[] objArr = qi9.c;
            long[] jArr3 = qi9.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr3[i2];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((255 & j) < 128) {
                                pm0 pm0 = (pm0) ((l23) objArr[(i2 << 3) + i5]);
                                if (!pm0.a) {
                                    qm0 qm0 = pm0.b;
                                    qm0.X = new WeakReference(qm0.o);
                                    qm0.o = obj;
                                    pm0.a = true;
                                }
                                String i6 = wg0.i("Binder_", v3c.w(pm0.c));
                                qm0 qm02 = pm0.b;
                                ir6 ir62 = hm9.m;
                                if (ir62 != null && ir62.c()) {
                                    us7 us7 = us7.X;
                                    WeakReference weakReference = qm02.X;
                                    jArr2 = jArr3;
                                    ir62.d(us7, i6, "onFinalize " + weakReference + "/" + (weakReference != null ? weakReference.get() : obj), (Throwable) null);
                                } else {
                                    jArr2 = jArr3;
                                }
                                WeakReference weakReference2 = pm0.b.X;
                                if (weakReference2 != null) {
                                    weakReference2.clear();
                                }
                                obj = null;
                                pm0.b.X = null;
                                i = 8;
                            } else {
                                jArr2 = jArr3;
                                i = i3;
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i4 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    jArr3 = jArr;
                }
            }
            this.cleanActions.a();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[EDGE_INSN: B:29:0x0036->B:16:0x0036 ?: BREAK  
    EDGE_INSN: B:30:0x0036->B:16:0x0036 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: findWidgetByScopeId-iP7A0G4  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final one.me.sdk.arch.Widget m78findWidgetByScopeIdiP7A0G4(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            boolean r0 = defpackage.tpa.f(r4, r0)
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.String r0 = "default"
            boolean r0 = defpackage.tpa.f(r4, r0)
            if (r0 == 0) goto L_0x0013
            return r3
        L_0x0013:
            uu3 r0 = r3.getParentController()
            boolean r2 = r0 instanceof one.me.sdk.arch.Widget
            if (r2 == 0) goto L_0x001e
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            if (r0 == 0) goto L_0x0036
            java.lang.String r2 = r0.m81getScopeIdIluPPks()
            boolean r2 = defpackage.tpa.f(r2, r4)
            if (r2 != 0) goto L_0x0036
            uu3 r0 = r0.getParentController()
            boolean r2 = r0 instanceof one.me.sdk.arch.Widget
            if (r2 == 0) goto L_0x001e
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            goto L_0x001f
        L_0x0036:
            uu3 r3 = r3.getTargetController()
            boolean r2 = r3 instanceof one.me.sdk.arch.Widget
            if (r2 == 0) goto L_0x0041
            one.me.sdk.arch.Widget r3 = (one.me.sdk.arch.Widget) r3
            goto L_0x0042
        L_0x0041:
            r3 = r1
        L_0x0042:
            if (r0 != 0) goto L_0x0055
            if (r3 == 0) goto L_0x004a
            java.lang.String r1 = r3.m81getScopeIdIluPPks()
        L_0x004a:
            if (r1 != 0) goto L_0x004e
            r4 = 0
            goto L_0x0052
        L_0x004e:
            boolean r4 = defpackage.tpa.f(r1, r4)
        L_0x0052:
            if (r4 == 0) goto L_0x0055
            r0 = r3
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.arch.Widget.m78findWidgetByScopeIdiP7A0G4(java.lang.String):one.me.sdk.arch.Widget");
    }

    private final w12 getChildWidgetContainer() {
        return (w12) this.childWidgetContainer$delegate.getValue();
    }

    /* renamed from: getSharedViewModel-cp94BC8$default  reason: not valid java name */
    public static /* synthetic */ je7 m79getSharedViewModelcp94BC8$default(Widget widget, String str, Class cls, k56 k56, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                k56 = null;
            }
            return widget.m82getSharedViewModelcp94BC8(str, cls, k56);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSharedViewModel-cp94BC8");
    }

    private static /* synthetic */ void get_viewLifecycleOwner$annotations() {
    }

    /* renamed from: sharedViewModel-qk3jasM$default  reason: not valid java name */
    public static /* synthetic */ je7 m80sharedViewModelqk3jasM$default(Widget widget, String str, k56 k56, int i, Object obj) {
        if (obj == null) {
            tpa.F();
            throw null;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedViewModel-qk3jasM");
    }

    /* access modifiers changed from: private */
    public static final View viewBinding$lambda$5(Widget widget, int i, View view) {
        Object obj;
        if (view != null) {
            l23 l23 = (l23) widget.cleanActions.i(view);
        }
        try {
            return widget.requireView().findViewById(i);
        } catch (Throwable th) {
            obj = new njc(th);
        }
        Object h = zr6.h(i, "#");
        if (obj instanceof njc) {
            obj = h;
        }
        throw new IllegalStateException(wg0.i("could not find view ", (String) obj), th);
    }

    /* access modifiers changed from: private */
    public static final e5f viewBinding$lambda$6(Widget widget, View view, l23 l23) {
        qi9 qi9 = widget.cleanActions;
        int e = qi9.e(view);
        if (e < 0) {
            e = ~e;
        }
        Object[] objArr = qi9.c;
        Object obj = objArr[e];
        qi9.b[e] = view;
        objArr[e] = l23;
        return e5f.a;
    }

    /* access modifiers changed from: private */
    public static final boolean viewBinding$lambda$7(Widget widget, View view) {
        return view.getParent() == widget.getView();
    }

    public final w12 addIfNeedChildWidgetContainer() {
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return null;
        }
        if (getChildWidgetContainer().getParent() == null) {
            br7.b(viewGroup, getChildWidgetContainer(), Integer.valueOf(viewGroup.getChildCount()));
        }
        return getChildWidgetContainer();
    }

    public final /* synthetic */ <T> fs args(String str, T t) {
        tpa.F();
        throw null;
    }

    public final <T> qm0 binding(k56 k56) {
        return new qm0((uu3) this, (m56) new rpc(18, k56), new a5g(this, 1), 8);
    }

    public final q7c childRouter(int i, m56 m56) {
        return new qm0((uu3) this, (m56) new ukc(this, i, m56), (a5g) null, 12);
    }

    public final q7c childSlotRouter(int i) {
        return new qm0((uu3) this, (m56) new z4g(this, i, 0), (a5g) null, 12);
    }

    public final <T> void collectInViewScope(mn5 mn5, fg7 fg7, a66 a66) {
        od2.L(new zn5(tu0.g(mn5, getViewLifecycleOwner().Q(), fg7), new g5g(a66, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final <VM extends pnf> je7 createViewModelLazy(Class<VM> cls, k56 k56) {
        w5g w5g = this.viewModelStore;
        w5g.getClass();
        String i = wg0.i("one.me.sdk.arch.ViewModelStore:key:", cls.getCanonicalName());
        w5g.b.k(i, (onf) k56.invoke());
        return new h5g(this, cls);
    }

    public final void doActionIfRootExist(m56 m56) {
        View view = getView();
        if (view != null) {
            m56.invoke(view);
        }
    }

    public final <V extends View> V findViewById(int i) {
        View view = getView();
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }

    public final qi9 getCleanActions$arch_release() {
        return this.cleanActions;
    }

    public final Context getContext() {
        return requireActivity();
    }

    public x27 getInsetsConfig() {
        return this.insetsConfig;
    }

    public final pg7 getLifecycleScope() {
        return f46.J(this.lifecycleOwner);
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public String m81getScopeIdIluPPks() {
        return this.scopeId;
    }

    public bvc getScreenDelegate() {
        return this.screenDelegate;
    }

    /* renamed from: getSharedViewModel-cp94BC8  reason: not valid java name */
    public final <VM extends pnf> je7 m82getSharedViewModelcp94BC8(String str, Class<VM> cls, k56 k56) {
        return new tnf(this, str, (Class) cls, k56);
    }

    public final eh7 getViewLifecycleOwner() {
        return this._viewLifecycleOwner;
    }

    public final pg7 getViewLifecycleScope() {
        return f46.J(this._viewLifecycleOwner);
    }

    public final w5g getViewModelStore$arch_release() {
        return this.viewModelStore;
    }

    public boolean isDialog() {
        return this.isDialog;
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onChangeStarted(zu3 zu3, av3 av3) {
        if (av3 == av3.POP_ENTER || av3 == av3.PUSH_ENTER) {
            getScreenDelegate().a();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(this.layoutRes, viewGroup, false);
    }

    public void onUpdateArgs(Bundle bundle, Bundle bundle2) {
    }

    public void onViewCreated(View view) {
    }

    public final im requireActivity() {
        return (im) getActivity();
    }

    public final Resources requireResources() {
        Resources resources = getResources();
        if (resources != null) {
            return resources;
        }
        throw new IllegalArgumentException(("Resources are null because of widget " + this + " is not attached to an activity").toString());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalArgumentException("view is null!".toString());
    }

    /* renamed from: sharedViewModel-qk3jasM  reason: not valid java name */
    public final /* synthetic */ <VM extends pnf> je7 m83sharedViewModelqk3jasM(String str, k56 k56) {
        tpa.F();
        throw null;
    }

    public final void updateArgs(Bundle bundle) {
        Bundle deepCopy = getArgs().deepCopy();
        getArgs().clear();
        getArgs().putAll(bundle);
        onUpdateArgs(deepCopy, getArgs());
    }

    public final <T extends View> q7c viewBinding(int i) {
        return new qm0((uu3) this, (m56) new z4g(this, i, 1), (a66) new a5g(this, 0), (m56) new b5g(this, 0));
    }

    public final /* synthetic */ <VM extends pnf> je7 viewModel(k56 k56) {
        tpa.F();
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Widget(Bundle bundle, int i, int i2, z84 z84) {
        this((i2 & 1) != 0 ? null : bundle, (i2 & 2) != 0 ? -1 : i);
    }

    public final /* synthetic */ <T> fs args(String str) {
        tpa.F();
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [gv3, eh7, java.lang.Object] */
    public Widget(Bundle bundle, int i) {
        super(bundle);
        this.layoutRes = i;
        this.viewModelStore = new w5g();
        this.cleanActions = new qi9(3);
        this.scopeId = "default";
        this.insetsConfig = x27.c;
        this.screenDelegate = dp3.X;
        this.tag = getClass().getName();
        i5g i5g = new i5g(this);
        this.internalLifecycleListener = i5g;
        ? obj = new Object();
        obj.a = new gh7(obj);
        addLifecycleListener(new ia3(2, obj));
        this._viewLifecycleOwner = obj;
        String name = getClass().getName();
        int incrementAndGet = allocationsCount.incrementAndGet();
        hm9.m(name, "allocations count = " + incrementAndGet, new Object[0]);
        addLifecycleListener(i5g);
        addLifecycleListener(vs7.a);
        this.childWidgetContainer$delegate = tu0.r(3, new rzd(17, this));
    }
}
