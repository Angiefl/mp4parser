package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.boxes.BoxWriteReadBase;
import com.googlecode.mp4parser.util.Matrix;

import java.util.Map;

public class TrackHeaderBoxTest extends BoxWriteReadBase<TrackHeaderBox> {
    @Override
    public Class<TrackHeaderBox> getBoxUnderTest() {
        return TrackHeaderBox.class;
    }

    @Override
    public void setupProperties(Map<String, Object> addPropsHere, TrackHeaderBox box) {
        addPropsHere.put("alternateGroup", (int) 2);
        addPropsHere.put("creationTime", (long) 3);
        addPropsHere.put("duration", (long) 423);
        addPropsHere.put("enabled", true);
        addPropsHere.put("height", 480.0);
        addPropsHere.put("inMovie", true);
        addPropsHere.put("inPoster", true);
        addPropsHere.put("inPreview", true);
        addPropsHere.put("layer", (int) 213);
        addPropsHere.put("matrix", Matrix.ROTATE_180);
        addPropsHere.put("modificationTime", (long) 4522);
        addPropsHere.put("trackId", (long) 23423);
        addPropsHere.put("volume", (float) 1.0);
        addPropsHere.put("width", 640.0);
    }
}
