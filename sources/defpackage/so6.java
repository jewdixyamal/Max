package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.ClientCookie;

/* renamed from: so6  reason: default package */
public abstract class so6 {
    public static final vi6[] a;
    public static final Map b;

    static {
        vi6 vi6 = r1;
        vi6 vi62 = new vi6(vi6.i, "");
        vi6 vi63 = r2;
        aw0 aw0 = vi6.f;
        vi6 vi64 = new vi6(aw0, HttpGet.METHOD_NAME);
        vi6 vi65 = r4;
        vi6 vi66 = new vi6(aw0, HttpPost.METHOD_NAME);
        vi6 vi67 = r4;
        aw0 aw02 = vi6.g;
        vi6 vi68 = new vi6(aw02, "/");
        vi6 vi69 = r6;
        vi6 vi610 = new vi6(aw02, "/index.html");
        vi6 vi611 = r6;
        aw0 aw03 = vi6.h;
        vi6 vi612 = new vi6(aw03, HttpHost.DEFAULT_SCHEME_NAME);
        vi6 vi613 = r8;
        vi6 vi614 = new vi6(aw03, "https");
        vi6 vi615 = r8;
        aw0 aw04 = vi6.e;
        vi6 vi616 = new vi6(aw04, "200");
        vi6 vi617 = r9;
        vi6 vi618 = new vi6(aw04, "204");
        vi6 vi619 = r10;
        vi6 vi620 = new vi6(aw04, "206");
        vi6 vi621 = r11;
        vi6 vi622 = new vi6(aw04, "304");
        vi6 vi623 = r12;
        vi6 vi624 = new vi6(aw04, "400");
        vi6 vi625 = r13;
        vi6 vi626 = vi6;
        vi6 vi627 = new vi6(aw04, "404");
        vi6 vi628 = r0;
        vi6 vi629 = vi63;
        vi6 vi630 = new vi6(aw04, "500");
        vi6 vi631 = r0;
        vi6 vi632 = new vi6("accept-charset", "");
        String str = "";
        vi6 vi633 = r0;
        vi6 vi634 = new vi6("accept-encoding", "gzip, deflate");
        vi6 vi635 = r0;
        vi6 vi636 = new vi6("accept-language", str);
        vi6 vi637 = r0;
        vi6 vi638 = new vi6("accept-ranges", str);
        vi6 vi639 = r0;
        vi6 vi640 = new vi6("accept", str);
        vi6 vi641 = r0;
        vi6 vi642 = new vi6("access-control-allow-origin", str);
        vi6 vi643 = r0;
        vi6 vi644 = new vi6("age", str);
        vi6 vi645 = r0;
        vi6 vi646 = new vi6("allow", str);
        vi6 vi647 = r0;
        vi6 vi648 = new vi6("authorization", str);
        vi6 vi649 = r0;
        vi6 vi650 = new vi6("cache-control", str);
        vi6 vi651 = r0;
        vi6 vi652 = new vi6("content-disposition", str);
        vi6 vi653 = r0;
        vi6 vi654 = new vi6("content-encoding", str);
        vi6 vi655 = r0;
        vi6 vi656 = new vi6("content-language", str);
        vi6 vi657 = r0;
        vi6 vi658 = new vi6("content-length", str);
        vi6 vi659 = r0;
        vi6 vi660 = new vi6("content-location", str);
        vi6 vi661 = r0;
        vi6 vi662 = new vi6("content-range", str);
        vi6 vi663 = r0;
        vi6 vi664 = new vi6("content-type", str);
        vi6 vi665 = r0;
        vi6 vi666 = new vi6("cookie", str);
        vi6 vi667 = r0;
        vi6 vi668 = new vi6("date", str);
        vi6 vi669 = r0;
        vi6 vi670 = new vi6("etag", str);
        vi6 vi671 = r0;
        vi6 vi672 = new vi6("expect", str);
        vi6 vi673 = r0;
        vi6 vi674 = new vi6(ClientCookie.EXPIRES_ATTR, str);
        vi6 vi675 = r0;
        vi6 vi676 = new vi6("from", str);
        vi6 vi677 = r0;
        vi6 vi678 = new vi6("host", str);
        vi6 vi679 = r0;
        vi6 vi680 = new vi6("if-match", str);
        vi6 vi681 = r0;
        vi6 vi682 = new vi6("if-modified-since", str);
        vi6 vi683 = r0;
        vi6 vi684 = new vi6("if-none-match", str);
        vi6 vi685 = r0;
        vi6 vi686 = new vi6("if-range", str);
        vi6 vi687 = r0;
        vi6 vi688 = new vi6("if-unmodified-since", str);
        vi6 vi689 = r0;
        vi6 vi690 = new vi6("last-modified", str);
        vi6 vi691 = r0;
        vi6 vi692 = new vi6("link", str);
        vi6 vi693 = r0;
        vi6 vi694 = new vi6("location", str);
        vi6 vi695 = r0;
        vi6 vi696 = new vi6("max-forwards", str);
        vi6 vi697 = r0;
        vi6 vi698 = new vi6("proxy-authenticate", str);
        vi6 vi699 = r0;
        vi6 vi6100 = new vi6("proxy-authorization", str);
        vi6 vi6101 = r0;
        vi6 vi6102 = new vi6("range", str);
        vi6 vi6103 = r0;
        vi6 vi6104 = new vi6("referer", str);
        vi6 vi6105 = r0;
        vi6 vi6106 = new vi6("refresh", str);
        vi6 vi6107 = r0;
        vi6 vi6108 = new vi6("retry-after", str);
        vi6 vi6109 = r0;
        vi6 vi6110 = new vi6("server", str);
        vi6 vi6111 = r0;
        vi6 vi6112 = new vi6("set-cookie", str);
        vi6 vi6113 = r0;
        vi6 vi6114 = new vi6("strict-transport-security", str);
        vi6 vi6115 = r0;
        vi6 vi6116 = new vi6("transfer-encoding", str);
        vi6 vi6117 = r0;
        vi6 vi6118 = new vi6("user-agent", str);
        vi6 vi6119 = r0;
        vi6 vi6120 = new vi6("vary", str);
        vi6 vi6121 = r0;
        vi6 vi6122 = new vi6("via", str);
        vi6 vi6123 = r0;
        vi6 vi6124 = new vi6("www-authenticate", str);
        vi6[] vi6Arr = {vi626, vi629, vi65, vi67, vi69, vi611, vi613, vi615, vi617, vi619, vi621, vi623, vi625, vi628, vi631, vi633, vi635, vi637, vi639, vi641, vi643, vi645, vi647, vi649, vi651, vi653, vi655, vi657, vi659, vi661, vi663, vi665, vi667, vi669, vi671, vi673, vi675, vi677, vi679, vi681, vi683, vi685, vi687, vi689, vi691, vi693, vi695, vi697, vi699, vi6101, vi6103, vi6105, vi6107, vi6109, vi6111, vi6113, vi6115, vi6117, vi6119, vi6121, vi6123};
        a = vi6Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(vi6Arr[i].b)) {
                linkedHashMap.put(vi6Arr[i].b, Integer.valueOf(i));
            }
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(aw0 aw0) {
        int c = aw0.c();
        for (int i = 0; i < c; i++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte f = aw0.f(i);
            if (b2 <= f && b3 >= f) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(aw0.j()));
            }
        }
    }
}
