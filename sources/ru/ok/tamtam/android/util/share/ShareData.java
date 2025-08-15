package ru.ok.tamtam.android.util.share;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ok/tamtam/android/util/share/ShareData;", "Landroid/os/Parcelable;", "", "type", "", "Landroid/net/Uri;", "images", "videos", "", "text", "shares", "files", "vcard", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "Le5f;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "I", "Ljava/util/List;", "Ljava/lang/String;", "", "isSingleMedia", "()Z", "Companion", "vjd", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
@Keep
public final class ShareData implements Parcelable {
    public static final Parcelable.Creator<ShareData> CREATOR = new e9b(26);
    public static final vjd Companion = new Object();
    public static final int FILES = 4;
    public static final int IMAGES = 1;
    public static final int SHARES = 3;
    public static final int TEXT = 0;
    public static final int VCARD = 5;
    public static final int VIDEOS = 2;
    public List<Uri> files;
    public List<Uri> images;
    public List<Uri> shares;
    public String text;
    public int type;
    public String vcard;
    public List<Uri> videos;

    public ShareData() {
        this(0, (List) null, (List) null, (String) null, (List) null, (List) null, (String) null, 127, (z84) null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean isSingleMedia() {
        int i = this.type;
        if (i != 1 && i != 2 && i != 4 && i != 3) {
            return false;
        }
        List<Uri> list = this.images;
        int size = list != null ? list.size() : 0;
        List<Uri> list2 = this.videos;
        int size2 = size + (list2 != null ? list2.size() : 0);
        List<Uri> list3 = this.files;
        int size3 = size2 + (list3 != null ? list3.size() : 0);
        List<Uri> list4 = this.shares;
        return size3 + (list4 != null ? list4.size() : 0) == 1;
    }

    public String toString() {
        int i = this.type;
        List<Uri> list = this.images;
        List<Uri> list2 = this.videos;
        String str = this.text;
        List<Uri> list3 = this.shares;
        List<Uri> list4 = this.files;
        String str2 = this.vcard;
        StringBuilder sb = new StringBuilder("ShareData{type=");
        sb.append(i);
        sb.append(", images=");
        sb.append(list);
        sb.append(", videos=");
        sb.append(list2);
        sb.append(", text='");
        sb.append(str);
        sb.append("', shares=");
        sb.append(list3);
        sb.append(", files=");
        sb.append(list4);
        sb.append(", vcard='");
        return zr6.l(sb, str2, "'}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        List<Uri> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Uri writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        List<Uri> list2 = this.videos;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (Uri writeParcelable2 : list2) {
                parcel.writeParcelable(writeParcelable2, i);
            }
        }
        parcel.writeString(this.text);
        List<Uri> list3 = this.shares;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (Uri writeParcelable3 : list3) {
                parcel.writeParcelable(writeParcelable3, i);
            }
        }
        List<Uri> list4 = this.files;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            for (Uri writeParcelable4 : list4) {
                parcel.writeParcelable(writeParcelable4, i);
            }
        }
        parcel.writeString(this.vcard);
    }

    public ShareData(int i, List<Uri> list, List<Uri> list2, String str, List<Uri> list3, List<Uri> list4, String str2) {
        this.type = i;
        this.images = list;
        this.videos = list2;
        this.text = str;
        this.shares = list3;
        this.files = list4;
        this.vcard = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShareData(int r6, java.util.List r7, java.util.List r8, java.lang.String r9, java.util.List r10, java.util.List r11, java.lang.String r12, int r13, defpackage.z84 r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0005
            r6 = 0
        L_0x0005:
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto L_0x000c
            r14 = r0
            goto L_0x000d
        L_0x000c:
            r14 = r7
        L_0x000d:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0013
            r1 = r0
            goto L_0x0014
        L_0x0013:
            r1 = r8
        L_0x0014:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001a
            r2 = r0
            goto L_0x001b
        L_0x001a:
            r2 = r9
        L_0x001b:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0021
            r3 = r0
            goto L_0x0022
        L_0x0021:
            r3 = r10
        L_0x0022:
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0028
            r4 = r0
            goto L_0x0029
        L_0x0028:
            r4 = r11
        L_0x0029:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r0 = r12
        L_0x002f:
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.util.share.ShareData.<init>(int, java.util.List, java.util.List, java.lang.String, java.util.List, java.util.List, java.lang.String, int, z84):void");
    }
}
