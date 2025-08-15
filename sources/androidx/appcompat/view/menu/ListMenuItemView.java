package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements pr8, AbsListView.SelectionBoundsAdjuster {
    public boolean A0;
    public final Drawable B0;
    public final boolean C0;
    public LayoutInflater D0;
    public boolean E0;
    public br8 a;
    public ImageView b;
    public RadioButton c;
    public TextView o;
    public CheckBox s0;
    public TextView t0;
    public ImageView u0;
    public ImageView v0;
    public LinearLayout w0;
    public final Drawable x0;
    public final int y0;
    public final Context z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = vsb.listMenuViewStyle;
        k8g x = k8g.x(getContext(), attributeSet, p3c.MenuView, i, 0);
        this.x0 = x.n(p3c.MenuView_android_itemBackground);
        int i2 = p3c.MenuView_android_itemTextAppearance;
        TypedArray typedArray = (TypedArray) x.b;
        this.y0 = typedArray.getResourceId(i2, -1);
        this.A0 = typedArray.getBoolean(p3c.MenuView_preserveIconSpacing, false);
        this.z0 = context;
        this.B0 = x.n(p3c.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, vsb.dropDownListViewStyle, 0);
        this.C0 = obtainStyledAttributes.hasValue(0);
        x.z();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.D0 == null) {
            this.D0 = LayoutInflater.from(getContext());
        }
        return this.D0;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.u0;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.v0;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.v0.getLayoutParams();
            rect.top = this.v0.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r0 == false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.br8 r11) {
        /*
            r10 = this;
            r10.a = r11
            boolean r0 = r11.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r0 = r2
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.X
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            wq8 r0 = r11.y0
            boolean r0 = r0.o()
            r3 = 1
            if (r0 == 0) goto L_0x0037
            wq8 r0 = r11.y0
            boolean r0 = r0.n()
            if (r0 == 0) goto L_0x0031
            char r0 = r11.u0
            goto L_0x0033
        L_0x0031:
            char r0 = r11.s0
        L_0x0033:
            if (r0 == 0) goto L_0x0037
            r0 = r3
            goto L_0x0038
        L_0x0037:
            r0 = r2
        L_0x0038:
            wq8 r4 = r11.y0
            r4.n()
            if (r0 == 0) goto L_0x005e
            br8 r0 = r10.a
            wq8 r4 = r0.y0
            boolean r4 = r4.o()
            if (r4 == 0) goto L_0x005a
            wq8 r4 = r0.y0
            boolean r4 = r4.n()
            if (r4 == 0) goto L_0x0054
            char r0 = r0.u0
            goto L_0x0056
        L_0x0054:
            char r0 = r0.s0
        L_0x0056:
            if (r0 == 0) goto L_0x005a
            r0 = r3
            goto L_0x005b
        L_0x005a:
            r0 = r2
        L_0x005b:
            if (r0 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r2 = r1
        L_0x005f:
            if (r2 != 0) goto L_0x0113
            android.widget.TextView r0 = r10.t0
            br8 r4 = r10.a
            wq8 r5 = r4.y0
            boolean r5 = r5.n()
            if (r5 == 0) goto L_0x0070
            char r5 = r4.u0
            goto L_0x0072
        L_0x0070:
            char r5 = r4.s0
        L_0x0072:
            if (r5 != 0) goto L_0x0078
            java.lang.String r1 = ""
            goto L_0x0110
        L_0x0078:
            wq8 r6 = r4.y0
            android.content.Context r7 = r6.a
            android.content.res.Resources r7 = r7.getResources()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r6.a
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            boolean r9 = r9.hasPermanentMenuKey()
            if (r9 == 0) goto L_0x009a
            int r9 = defpackage.i2c.abc_prepend_shortcut_label
            java.lang.String r9 = r7.getString(r9)
            r8.append(r9)
        L_0x009a:
            boolean r6 = r6.n()
            if (r6 == 0) goto L_0x00a3
            int r4 = r4.v0
            goto L_0x00a5
        L_0x00a3:
            int r4 = r4.t0
        L_0x00a5:
            int r6 = defpackage.i2c.abc_menu_meta_shortcut_label
            java.lang.String r6 = r7.getString(r6)
            r9 = 65536(0x10000, float:9.18355E-41)
            defpackage.br8.c(r4, r9, r6, r8)
            int r6 = defpackage.i2c.abc_menu_ctrl_shortcut_label
            java.lang.String r6 = r7.getString(r6)
            r9 = 4096(0x1000, float:5.74E-42)
            defpackage.br8.c(r4, r9, r6, r8)
            int r6 = defpackage.i2c.abc_menu_alt_shortcut_label
            java.lang.String r6 = r7.getString(r6)
            r9 = 2
            defpackage.br8.c(r4, r9, r6, r8)
            int r6 = defpackage.i2c.abc_menu_shift_shortcut_label
            java.lang.String r6 = r7.getString(r6)
            defpackage.br8.c(r4, r3, r6, r8)
            int r3 = defpackage.i2c.abc_menu_sym_shortcut_label
            java.lang.String r3 = r7.getString(r3)
            r6 = 4
            defpackage.br8.c(r4, r6, r3, r8)
            int r3 = defpackage.i2c.abc_menu_function_shortcut_label
            java.lang.String r3 = r7.getString(r3)
            defpackage.br8.c(r4, r1, r3, r8)
            if (r5 == r1) goto L_0x0103
            r1 = 10
            if (r5 == r1) goto L_0x00f9
            r1 = 32
            if (r5 == r1) goto L_0x00ef
            r8.append(r5)
            goto L_0x010c
        L_0x00ef:
            int r1 = defpackage.i2c.abc_menu_space_shortcut_label
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L_0x010c
        L_0x00f9:
            int r1 = defpackage.i2c.abc_menu_enter_shortcut_label
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L_0x010c
        L_0x0103:
            int r1 = defpackage.i2c.abc_menu_delete_shortcut_label
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
        L_0x010c:
            java.lang.String r1 = r8.toString()
        L_0x0110:
            r0.setText(r1)
        L_0x0113:
            android.widget.TextView r0 = r10.t0
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L_0x0120
            android.widget.TextView r0 = r10.t0
            r0.setVisibility(r2)
        L_0x0120:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.B0
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.d(br8):void");
    }

    public br8 getItemData() {
        return this.a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.x0);
        TextView textView = (TextView) findViewById(mvb.title);
        this.o = textView;
        int i = this.y0;
        if (i != -1) {
            textView.setTextAppearance(this.z0, i);
        }
        this.t0 = (TextView) findViewById(mvb.shortcut);
        ImageView imageView = (ImageView) findViewById(mvb.submenuarrow);
        this.u0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.B0);
        }
        this.v0 = (ImageView) findViewById(mvb.group_divider);
        this.w0 = (LinearLayout) findViewById(mvb.content);
    }

    public final void onMeasure(int i, int i2) {
        if (this.b != null && this.A0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        View view;
        CompoundButton compoundButton;
        if (z || this.c != null || this.s0 != null) {
            if ((this.a.I0 & 4) != 0) {
                if (this.c == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(zyb.abc_list_menu_item_radio, this, false);
                    this.c = radioButton;
                    LinearLayout linearLayout = this.w0;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.c;
                view = this.s0;
            } else {
                if (this.s0 == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(zyb.abc_list_menu_item_checkbox, this, false);
                    this.s0 = checkBox;
                    LinearLayout linearLayout2 = this.w0;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.s0;
                view = this.c;
            }
            if (z) {
                compoundButton.setChecked(this.a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.s0;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.a.I0 & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(zyb.abc_list_menu_item_radio, this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.w0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
        } else {
            if (this.s0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(zyb.abc_list_menu_item_checkbox, this, false);
                this.s0 = checkBox;
                LinearLayout linearLayout2 = this.w0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.s0;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.E0 = z;
        this.A0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.v0;
        if (imageView != null) {
            imageView.setVisibility((this.C0 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.a.y0.getClass();
        boolean z = this.E0;
        if (z || this.A0) {
            ImageView imageView = this.b;
            if (imageView != null || drawable != null || this.A0) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(zyb.abc_list_menu_item_icon, this, false);
                    this.b = imageView2;
                    LinearLayout linearLayout = this.w0;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.A0) {
                    ImageView imageView3 = this.b;
                    if (!z) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.b.getVisibility() != 0) {
                        this.b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.o.setText(charSequence);
            if (this.o.getVisibility() != 0) {
                this.o.setVisibility(0);
            }
        } else if (this.o.getVisibility() != 8) {
            this.o.setVisibility(8);
        }
    }
}
