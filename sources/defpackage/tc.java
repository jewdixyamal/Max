package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* renamed from: tc  reason: default package */
public class tc extends fn implements DialogInterface {
    public final rc Y = new rc(getContext(), this, getWindow());

    public tc(Context context, int i) {
        super(context, g(context, i));
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(vsb.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        ListAdapter listAdapter;
        View findViewById;
        int i = 2;
        super.onCreate(bundle);
        rc rcVar = this.Y;
        rcVar.b.setContentView(rcVar.F);
        int i2 = mvb.parentPanel;
        Window window = rcVar.c;
        View findViewById2 = window.findViewById(i2);
        View findViewById3 = findViewById2.findViewById(mvb.topPanel);
        View findViewById4 = findViewById2.findViewById(mvb.contentPanel);
        View findViewById5 = findViewById2.findViewById(mvb.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(mvb.customPanel);
        View view = rcVar.h;
        Context context = rcVar.a;
        View view2 = null;
        if (view == null) {
            view = rcVar.i != 0 ? LayoutInflater.from(context).inflate(rcVar.i, viewGroup, false) : null;
        }
        boolean z2 = view != null;
        if (!z2 || !rc.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(mvb.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (rcVar.j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (rcVar.g != null) {
                ((rh7) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(mvb.topPanel);
        View findViewById7 = viewGroup.findViewById(mvb.contentPanel);
        View findViewById8 = viewGroup.findViewById(mvb.buttonPanel);
        ViewGroup b = rc.b(findViewById6, findViewById3);
        ViewGroup b2 = rc.b(findViewById7, findViewById4);
        ViewGroup b3 = rc.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(mvb.scrollView);
        rcVar.w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        rcVar.w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(16908299);
        rcVar.B = textView;
        if (textView != null) {
            CharSequence charSequence = rcVar.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                rcVar.w.removeView(rcVar.B);
                if (rcVar.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) rcVar.w.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(rcVar.w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(rcVar.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) b3.findViewById(16908313);
        rcVar.k = button;
        e0d e0d = rcVar.L;
        button.setOnClickListener(e0d);
        boolean isEmpty = TextUtils.isEmpty(rcVar.l);
        int i3 = rcVar.d;
        if (!isEmpty || rcVar.n != null) {
            rcVar.k.setText(rcVar.l);
            Drawable drawable = rcVar.n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                rcVar.k.setCompoundDrawables(rcVar.n, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            rcVar.k.setVisibility(0);
            z = true;
        } else {
            rcVar.k.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) b3.findViewById(16908314);
        rcVar.o = button2;
        button2.setOnClickListener(e0d);
        if (!TextUtils.isEmpty(rcVar.p) || rcVar.r != null) {
            rcVar.o.setText(rcVar.p);
            Drawable drawable2 = rcVar.r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                rcVar.o.setCompoundDrawables(rcVar.r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            rcVar.o.setVisibility(0);
            z |= true;
        } else {
            rcVar.o.setVisibility(8);
        }
        Button button3 = (Button) b3.findViewById(16908315);
        rcVar.s = button3;
        button3.setOnClickListener(e0d);
        if (!TextUtils.isEmpty(rcVar.t) || rcVar.v != null) {
            rcVar.s.setText(rcVar.t);
            Drawable drawable3 = rcVar.v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                rcVar.s.setCompoundDrawables(rcVar.v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            rcVar.s.setVisibility(0);
            z |= true;
        } else {
            rcVar.s.setVisibility(8);
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(vsb.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                Button button4 = rcVar.k;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (z) {
                Button button5 = rcVar.o;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (z) {
                Button button6 = rcVar.s;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (!z) {
            b3.setVisibility(8);
        }
        if (rcVar.C != null) {
            b.addView(rcVar.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(mvb.title_template).setVisibility(8);
        } else {
            rcVar.z = (ImageView) window.findViewById(16908294);
            if (!(!TextUtils.isEmpty(rcVar.e)) || !rcVar.J) {
                window.findViewById(mvb.title_template).setVisibility(8);
                rcVar.z.setVisibility(8);
                b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(mvb.alertTitle);
                rcVar.A = textView2;
                textView2.setText(rcVar.e);
                int i4 = rcVar.x;
                if (i4 != 0) {
                    rcVar.z.setImageResource(i4);
                } else {
                    Drawable drawable4 = rcVar.y;
                    if (drawable4 != null) {
                        rcVar.z.setImageDrawable(drawable4);
                    } else {
                        rcVar.A.setPadding(rcVar.z.getPaddingLeft(), rcVar.z.getPaddingTop(), rcVar.z.getPaddingRight(), rcVar.z.getPaddingBottom());
                        rcVar.z.setVisibility(8);
                    }
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i5 = (b == null || b.getVisibility() == 8) ? 0 : 1;
        boolean z4 = b3.getVisibility() != 8;
        if (!z4 && (findViewById = b2.findViewById(mvb.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = rcVar.w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (!(rcVar.f == null && rcVar.g == null)) {
                view2 = b.findViewById(mvb.titleDividerNoCustom);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            View findViewById9 = b2.findViewById(mvb.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = rcVar.g;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z4 || i5 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i5 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z4 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
            }
        }
        if (!z3) {
            View view3 = rcVar.g;
            if (view3 == null) {
                view3 = rcVar.w;
            }
            if (view3 != null) {
                if (!z4) {
                    i = 0;
                }
                int i6 = i5 | i;
                View findViewById10 = window.findViewById(mvb.scrollIndicatorUp);
                View findViewById11 = window.findViewById(mvb.scrollIndicatorDown);
                WeakHashMap weakHashMap = zmf.a;
                pmf.d(view3, i6, 3);
                if (findViewById10 != null) {
                    b2.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = rcVar.g;
        if (alertController$RecycleListView2 != null && (listAdapter = rcVar.D) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i7 = rcVar.E;
            if (i7 > -1) {
                alertController$RecycleListView2.setItemChecked(i7, true);
                alertController$RecycleListView2.setSelection(i7);
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.Y.w;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.Y.w;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        rc rcVar = this.Y;
        rcVar.e = charSequence;
        TextView textView = rcVar.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
