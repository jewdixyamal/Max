package defpackage;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpStatus;

/* renamed from: u55  reason: default package */
public final class u55 {
    public static final g65[] c;
    public static final g65[][] d;
    public static final HashSet e = new HashSet(Arrays.asList(new String[]{"FNumber", "ExposureTime", "GPSTimeStamp"}));
    public final List a;
    public final ByteOrder b;

    static {
        String str = "SubIFDPointer";
        String str2 = str;
        g65[] g65Arr = {new g65(256, "ImageWidth", 3, 4), new g65(257, "ImageLength", 3, 4), new g65("Make", 271, 2), new g65("Model", 272, 2), new g65("Orientation", 274, 3), new g65("XResolution", 282, 5), new g65("YResolution", 283, 5), new g65("ResolutionUnit", 296, 3), new g65("Software", HttpStatus.SC_USE_PROXY, 2), new g65("DateTime", 306, 2), new g65("YCbCrPositioning", 531, 3), new g65("SubIFDPointer", 330, 4), new g65("ExifIFDPointer", 34665, 4), new g65("GPSInfoIFDPointer", 34853, 4)};
        g65 g65 = r1;
        g65 g652 = new g65("ExposureTime", 33434, 5);
        g65 g653 = r1;
        g65 g654 = new g65("FNumber", 33437, 5);
        g65 g655 = r1;
        g65 g656 = new g65("ExposureProgram", 34850, 3);
        g65 g657 = r1;
        g65 g658 = new g65("PhotographicSensitivity", 34855, 3);
        g65 g659 = r1;
        g65 g6510 = new g65("SensitivityType", 34864, 3);
        g65 g6511 = r1;
        g65 g6512 = new g65("ExifVersion", 36864, 2);
        g65 g6513 = r1;
        g65 g6514 = new g65("DateTimeOriginal", 36867, 2);
        g65 g6515 = r1;
        g65 g6516 = new g65("DateTimeDigitized", 36868, 2);
        g65 g6517 = r1;
        g65 g6518 = new g65("ComponentsConfiguration", 37121, 7);
        g65 g6519 = r1;
        g65 g6520 = new g65("ShutterSpeedValue", 37377, 10);
        g65 g6521 = r1;
        g65 g6522 = new g65("ApertureValue", 37378, 5);
        g65 g6523 = r1;
        g65 g6524 = new g65("BrightnessValue", 37379, 10);
        g65 g6525 = r1;
        g65 g6526 = new g65("ExposureBiasValue", 37380, 10);
        g65 g6527 = r1;
        g65 g6528 = new g65("MaxApertureValue", 37381, 5);
        g65 g6529 = r1;
        g65 g6530 = new g65("MeteringMode", 37383, 3);
        g65 g6531 = r1;
        g65 g6532 = new g65("LightSource", 37384, 3);
        g65 g6533 = r1;
        g65 g6534 = new g65("Flash", 37385, 3);
        g65 g6535 = r1;
        g65 g6536 = new g65("FocalLength", 37386, 5);
        g65 g6537 = r1;
        g65 g6538 = new g65("SubSecTime", 37520, 2);
        g65 g6539 = r1;
        g65 g6540 = new g65("SubSecTimeOriginal", 37521, 2);
        g65 g6541 = r1;
        g65 g6542 = new g65("SubSecTimeDigitized", 37522, 2);
        g65 g6543 = r1;
        g65 g6544 = new g65("FlashpixVersion", 40960, 7);
        g65 g6545 = r1;
        g65 g6546 = new g65("ColorSpace", 40961, 3);
        g65 g6547 = r1;
        g65 g6548 = new g65(40962, "PixelXDimension", 3, 4);
        g65 g6549 = r1;
        g65 g6550 = new g65(40963, "PixelYDimension", 3, 4);
        g65 g6551 = r1;
        g65 g6552 = new g65("InteroperabilityIFDPointer", 40965, 4);
        g65 g6553 = r1;
        g65 g6554 = new g65("FocalPlaneResolutionUnit", 41488, 3);
        g65 g6555 = r1;
        g65 g6556 = new g65("SensingMethod", 41495, 3);
        g65 g6557 = r1;
        g65 g6558 = new g65("FileSource", 41728, 7);
        g65 g6559 = r1;
        g65 g6560 = new g65("SceneType", 41729, 7);
        g65 g6561 = r1;
        g65 g6562 = new g65("CustomRendered", 41985, 3);
        g65 g6563 = r1;
        g65 g6564 = new g65("ExposureMode", 41986, 3);
        g65 g6565 = r1;
        g65 g6566 = new g65("WhiteBalance", 41987, 3);
        g65 g6567 = r1;
        g65 g6568 = new g65("SceneCaptureType", 41990, 3);
        g65 g6569 = r1;
        g65 g6570 = new g65("Contrast", 41992, 3);
        g65 g6571 = r1;
        g65 g6572 = new g65("Saturation", 41993, 3);
        g65 g6573 = r1;
        g65 g6574 = new g65("Sharpness", 41994, 3);
        g65[] g65Arr2 = {g65, g653, g655, g657, g659, g6511, g6513, g6515, g6517, g6519, g6521, g6523, g6525, g6527, g6529, g6531, g6533, g6535, g6537, g6539, g6541, g6543, g6545, g6547, g6549, g6551, g6553, g6555, g6557, g6559, g6561, g6563, g6565, g6567, g6569, g6571, g6573};
        g65 g6575 = new g65("GPSVersionID", 0, 1);
        g65 g6576 = new g65("GPSLatitudeRef", 1, 2);
        g65 g6577 = new g65(2, "GPSLatitude", 5, 10);
        g65 g6578 = new g65("GPSLongitudeRef", 3, 2);
        g65 g6579 = new g65(4, "GPSLongitude", 5, 10);
        g65 g6580 = new g65("GPSAltitudeRef", 5, 1);
        g65 g6581 = new g65("GPSAltitude", 6, 5);
        g65 g6582 = new g65("GPSTimeStamp", 7, 5);
        g65 g6583 = new g65("GPSSpeedRef", 12, 2);
        g65 g6584 = new g65("GPSTrackRef", 14, 2);
        g65[] g65Arr3 = g65Arr;
        g65 g6585 = new g65("GPSImgDirectionRef", 16, 2);
        g65 g6586 = new g65("GPSDestBearingRef", 23, 2);
        c = new g65[]{new g65(str, 330, 4), new g65("ExifIFDPointer", 34665, 4), new g65("GPSInfoIFDPointer", 34853, 4), new g65("InteroperabilityIFDPointer", 40965, 4)};
        d = new g65[][]{g65Arr3, g65Arr2, new g65[]{g6575, g6576, g6577, g6578, g6579, g6580, g6581, g6582, g6583, g6584, g6585, g6586, new g65("GPSDestDistanceRef", 25, 2)}, new g65[]{new g65("InteroperabilityIndex", 1, 2)}};
    }

    public u55(ByteOrder byteOrder, ArrayList arrayList) {
        c54.p("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.b = byteOrder;
        this.a = arrayList;
    }

    public final Map a(int i) {
        c54.l(i, wg0.g(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "), 0, 4);
        return (Map) this.a.get(i);
    }
}
