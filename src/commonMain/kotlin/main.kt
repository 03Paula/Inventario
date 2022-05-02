import com.soywiz.korge.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.Colors
import com.soywiz.korim.format.*
import com.soywiz.korio.file.std.*

suspend fun main() = Korge(width = 1280, height = 720, bgcolor = Colors["#2b2b2b"]) {
	val cuadradovela = image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.2)
	}

	val vela = image(resourcesVfs["vela.png"].readBitmap()){
		scale(1.7)
	}
	cuadradovela.alignBottomToBottomOf(this)
	vela.centerOn(cuadradovela)
	//TODO APAREZCA NOMBRE DEL ITEM AL PASAR CON EL RATÓN
	/*
	vela.onOver {
		val cuadrado = solidRect(60,30,Colors.LIGHTGREY)
		cuadrado.xy(5,620)
		val texto = text("Vela")
		texto.centerOn(cuadrado)
	}
	vela.onOut {

	}
	 */


	val cuadradocabeza = image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.2)
	}
	val cabeza = image(resourcesVfs["cabeza.png"].readBitmap()){
		scale(1.7)
	}
	cuadradocabeza.alignBottomToBottomOf(this)
	cuadradocabeza.alignLeftToRightOf(cuadradovela,5)
	cabeza.centerOn(cuadradocabeza)

	val cuadradoCuerpo = image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.2)
	}

	val armadura = image(resourcesVfs["cuerpo.png"].readBitmap()){
		scale(1.7)
	}
	cuadradoCuerpo.alignBottomToBottomOf(this)
	cuadradoCuerpo.alignLeftToRightOf(cuadradocabeza,5)
	armadura.centerOn(cuadradoCuerpo)

	val cuadradoManos = image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.2)
	}

	val guante = image(resourcesVfs["manos.png"].readBitmap()){
		scale(1.7)
	}
	cuadradoManos.alignBottomToBottomOf(this)
	cuadradoManos.alignLeftToRightOf(cuadradoCuerpo,5)
	guante.centerOn(cuadradoManos)

	val cuadradoPiernas = image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.2)
	}

	val pantalon = image(resourcesVfs["piernas.png"].readBitmap()){
		scale(1.7)
	}
	cuadradoPiernas.alignBottomToBottomOf(this)
	cuadradoPiernas.alignLeftToRightOf(cuadradoManos,5)
	pantalon.centerOn(cuadradoPiernas)

	val cuadradoPies = image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.2)
	}

	val botas = image(resourcesVfs["pies.png"].readBitmap()){
		scale(1.7)
	}
	cuadradoPies.alignBottomToBottomOf(this)
	cuadradoPies.alignLeftToRightOf(cuadradoPiernas,5)
	botas.centerOn(cuadradoPies)

	val cuadradoManoSecundaria = image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.2)
	}

	val escudo = image(resourcesVfs["manoSecundaria.png"].readBitmap()){
		scale(1.7)
	}
	cuadradoManoSecundaria.alignBottomToBottomOf(this)
	cuadradoManoSecundaria.alignLeftToRightOf(cuadradoPies,5)
	escudo.centerOn(cuadradoManoSecundaria)

	val cuadradoArma = image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.2)
	}

	val arma = image(resourcesVfs["arma.png"].readBitmap()){
		scale(1.7)
	}
	cuadradoArma.alignBottomToBottomOf(this)
	cuadradoArma.alignLeftToRightOf(cuadradoManoSecundaria,5)
	arma.centerOn(cuadradoArma)

	val cuadradoMascara= image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.2)
	}

	val mascara = image(resourcesVfs["mascara.png"].readBitmap()){
		scale(1.7)
	}
	cuadradoMascara.alignBottomToBottomOf(this)
	cuadradoMascara.alignLeftToRightOf(cuadradoArma,5)
	mascara.centerOn(cuadradoMascara)

	val cuadradoTarro= image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.2)
	}

	val tarro = image(resourcesVfs["tarro.png"].readBitmap()){
		scale(1.7)
	}
	cuadradoTarro.alignBottomToBottomOf(this)
	cuadradoTarro.alignLeftToRightOf(cuadradoMascara,5)
	tarro.centerOn(cuadradoTarro)

	val cuadradoColgante= image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.2)
	}

	val collar = image(resourcesVfs["colgante.png"].readBitmap()){
		scale(1.7)
	}
	cuadradoColgante.alignBottomToBottomOf(this)
	cuadradoColgante.alignLeftToRightOf(cuadradoTarro,5)
	collar.centerOn(cuadradoColgante)

	val cuadradoAmuleto= image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.2)
	}

	val amuleto = image(resourcesVfs["amuleto.png"].readBitmap()){
		scale(1.7)
	}
	cuadradoAmuleto.alignBottomToBottomOf(this)
	cuadradoAmuleto.alignLeftToRightOf(cuadradoColgante,5)
	amuleto.centerOn(cuadradoAmuleto)

	val cuadradoGema= image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.2)
	}

	val gema = image(resourcesVfs["gema.png"].readBitmap()){
		scale(1.7)
	}
	cuadradoGema.alignBottomToBottomOf(this)
	cuadradoGema.alignLeftToRightOf(cuadradoAmuleto,5)
	gema.centerOn(cuadradoGema)

	val cuadradoGremorio= image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.7)
	}

	val gremorio = image(resourcesVfs["grimorio.png"].readBitmap()){
		scale(2.2)
	}
	cuadradoGremorio.alignBottomToBottomOf(this)
	cuadradoGremorio.alignLeftToRightOf(cuadradoGema,25)
	gremorio.centerOn(cuadradoGremorio)

	val cuadradopergamino = image(resourcesVfs["cuadradon.png"].readBitmap()){
		scale(2.7)
	}

	val pergamino = image(resourcesVfs["pergamino.png"].readBitmap()){
		scale(2)
	}
	cuadradopergamino.alignBottomToBottomOf(this)
	cuadradopergamino.alignLeftToRightOf(cuadradoGremorio,5)
	pergamino.centerOn(cuadradopergamino)


}