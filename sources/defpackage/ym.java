package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: ym  reason: default package */
public final class ym implements Window.Callback {
    public boolean X;
    public final /* synthetic */ dn Y;
    public final Window.Callback a;
    public qje b;
    public boolean c;
    public boolean o;

    public ym(dn dnVar, Window.Callback callback) {
        this.Y = dnVar;
        if (callback != null) {
            this.a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* JADX INFO: finally extract failed */
    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
            this.c = false;
        } catch (Throwable th) {
            this.c = false;
            throw th;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        y5g.a(this.a, list, menu, i);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.o;
        Window.Callback callback = this.a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.Y.r(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (this.a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        dn dnVar = this.Y;
        dnVar.x();
        ote ote = dnVar.z0;
        if (ote != null && ote.L(keyCode, keyEvent)) {
            return true;
        }
        cn cnVar = dnVar.X0;
        if (cnVar == null || !dnVar.D(cnVar, keyEvent.getKeyCode(), keyEvent)) {
            if (dnVar.X0 == null) {
                cn w = dnVar.w(0);
                dnVar.E(w, keyEvent);
                boolean D = dnVar.D(w, keyEvent.getKeyCode(), keyEvent);
                w.k = false;
                if (D) {
                    return true;
                }
            }
            return false;
        }
        cn cnVar2 = dnVar.X0;
        if (cnVar2 == null) {
            return true;
        }
        cnVar2.l = true;
        return true;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    public final void onContentChanged() {
        if (this.c) {
            this.a.onContentChanged();
        }
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof wq8)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public final View onCreatePanelView(int i) {
        qje qje = this.b;
        if (qje != null) {
            View view = i == 0 ? new View(((mwe) qje.b).o.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.a.onCreatePanelView(i);
    }

    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        dn dnVar = this.Y;
        if (i == 108) {
            dnVar.x();
            ote ote = dnVar.z0;
            if (ote != null) {
                ote.h(true);
            }
        } else {
            dnVar.getClass();
        }
        return true;
    }

    public final void onPanelClosed(int i, Menu menu) {
        if (this.X) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        dn dnVar = this.Y;
        if (i == 108) {
            dnVar.x();
            ote ote = dnVar.z0;
            if (ote != null) {
                ote.h(false);
            }
        } else if (i == 0) {
            cn w = dnVar.w(i);
            if (w.m) {
                dnVar.p(w, false);
            }
        } else {
            dnVar.getClass();
        }
    }

    public final void onPointerCaptureChanged(boolean z) {
        z5g.a(this.a, z);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        wq8 wq8 = menu instanceof wq8 ? (wq8) menu : null;
        if (i == 0 && wq8 == null) {
            return false;
        }
        if (wq8 != null) {
            wq8.I0 = true;
        }
        qje qje = this.b;
        if (qje != null && i == 0) {
            mwe mwe = (mwe) qje.b;
            if (!mwe.Z) {
                mwe.o.l = true;
                mwe.Z = true;
            }
        }
        boolean onPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (wq8 != null) {
            wq8.I0 = false;
        }
        return onPreparePanel;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        wq8 wq8 = this.Y.w(0).h;
        if (wq8 != null) {
            d(list, wq8, i);
        } else {
            d(list, menu, i);
        }
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return x5g.a(this.a, searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [die, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v12, types: [uxd, java.lang.Object, uq8, j7] */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        dn dnVar = this.Y;
        dnVar.getClass();
        if (i != 0) {
            return x5g.b(this.a, callback, i);
        }
        Context context = dnVar.v0;
        ? obj = new Object();
        obj.b = context;
        obj.a = callback;
        obj.c = new ArrayList();
        obj.o = new qpd();
        j7 j7Var = dnVar.F0;
        if (j7Var != null) {
            j7Var.a();
        }
        imc imc = new imc((Object) dnVar, 3, (Object) obj);
        dnVar.x();
        ote ote = dnVar.z0;
        if (ote != null) {
            dnVar.F0 = ote.W(imc);
        }
        if (dnVar.F0 == null) {
            vof vof = dnVar.J0;
            if (vof != null) {
                vof.b();
            }
            j7 j7Var2 = dnVar.F0;
            if (j7Var2 != null) {
                j7Var2.a();
            }
            if (dnVar.y0 != null) {
                boolean z = dnVar.b1;
            }
            if (dnVar.G0 == null) {
                boolean z2 = dnVar.T0;
                Context context2 = dnVar.v0;
                if (z2) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(vsb.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        du3 du3 = new du3(context2, 0);
                        du3.getTheme().setTo(newTheme);
                        context2 = du3;
                    }
                    dnVar.G0 = new ActionBarContextView(context2, (AttributeSet) null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, vsb.actionModePopupWindowStyle);
                    dnVar.H0 = popupWindow;
                    i6b.d(popupWindow, 2);
                    dnVar.H0.setContentView(dnVar.G0);
                    dnVar.H0.setWidth(-1);
                    context2.getTheme().resolveAttribute(vsb.actionBarSize, typedValue, true);
                    dnVar.G0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    dnVar.H0.setHeight(-2);
                    dnVar.I0 = new sm(dnVar, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) dnVar.L0.findViewById(mvb.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        dnVar.x();
                        ote ote2 = dnVar.z0;
                        Context y = ote2 != null ? ote2.y() : null;
                        if (y != null) {
                            context2 = y;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        dnVar.G0 = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (dnVar.G0 != null) {
                vof vof2 = dnVar.J0;
                if (vof2 != null) {
                    vof2.b();
                }
                dnVar.G0.e();
                Context context3 = dnVar.G0.getContext();
                ActionBarContextView actionBarContextView = dnVar.G0;
                ? obj2 = new Object();
                obj2.c = context3;
                obj2.o = actionBarContextView;
                obj2.X = imc;
                wq8 wq8 = new wq8(actionBarContextView.getContext());
                wq8.w0 = 1;
                obj2.s0 = wq8;
                wq8.X = obj2;
                if (((i7) imc.b).o(obj2, wq8)) {
                    obj2.g();
                    dnVar.G0.c(obj2);
                    dnVar.F0 = obj2;
                    if (dnVar.K0 && (viewGroup = dnVar.L0) != null && viewGroup.isLaidOut()) {
                        dnVar.G0.setAlpha(0.0f);
                        vof a2 = zmf.a(dnVar.G0);
                        a2.a(1.0f);
                        dnVar.J0 = a2;
                        a2.d(new tm(1, dnVar));
                    } else {
                        dnVar.G0.setAlpha(1.0f);
                        dnVar.G0.setVisibility(0);
                        if (dnVar.G0.getParent() instanceof View) {
                            WeakHashMap weakHashMap = zmf.a;
                            mmf.c((View) dnVar.G0.getParent());
                        }
                    }
                    if (dnVar.H0 != null) {
                        dnVar.w0.getDecorView().post(dnVar.I0);
                    }
                } else {
                    dnVar.F0 = null;
                }
            }
            dnVar.G();
            dnVar.F0 = dnVar.F0;
        }
        dnVar.G();
        j7 j7Var3 = dnVar.F0;
        if (j7Var3 != null) {
            return obj.s(j7Var3);
        }
        return null;
    }

    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
