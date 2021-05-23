#include frex:shaders/api/fragment.glsl
#include frex:shaders/lib/math.glsl

// The name of this method is special - Canvas will call it for each fragment associated with your shader
void frx_startFragment(inout frx_FragmentData fragData) {
	// modify appearance where texture is lighter in color
	//if (frx_luminance(fragData.spriteColor.rgb) > 0.1) {

		// mix with the stone texture colors
		fragData.spriteColor = mix(fragData.spriteColor, vec4(1, 1, 1, 1), 0.7);

		// make these fragments fully lit
		fragData.emissivity = 1.0;
		fragData.ao = false;
		fragData.diffuse = false;
	}
//}