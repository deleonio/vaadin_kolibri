package com.example.adapters;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

import java.util.Optional;

/**
 * Der ButtonLink ist semantisch ein Button und hat das Design eines Links. Hierzu werden alle relevanten Properties der Button-Komponente übernommen und um die Design-bestimmenden Properties des Links erweitert.

Einen Button kann man deaktivieren und daher gibt es bei einem ButtonLink das Property `_disabled`. Wie das optisch ausgestaltet wird, entscheidet die UX-Designer:in.

Statt, wie bei einem Link, `_href` zu verwenden, wird bei einem ButtonLink das Property über den `Click-Callback` gesteuert. Hierzu wird das `_on`-Property verwendet.

Bei einem Link gibt es das Property `target`, welches ggf. den Link in einem neuen Fenster/Tab öffnet. Das Verhalten ist aktuell noch nicht umgesetzt.

Da der Link, nicht wie der Button, in mehrere Varianten (`primary` oder `secondary` usw.) angeboten wird, stehen die Properties `_customClass` und `_variant` nicht zur Verfügung.
 */

@Tag("kol-button-link")
@NpmPackage(value = "@public-ui/components", version = "1.6.0-rc.23")
@JsModule("@public-ui/components/dist/components/kol-button-link")
public class KolButtonLink extends Component {
	/**
	 * Gibt an, mit welcher Tastenkombination man das interaktive Element der Komponente auslösen oder fokussieren kann.
	 *
	 * @param value String
	 */
	public void setAccessKey(final String value) {
		getElement().setProperty("_access-key", value.toString());
	}

	/**
	 * Gibt an, mit welcher Tastenkombination man das interaktive Element der Komponente auslösen oder fokussieren kann.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getAccessKey() {
		var value = getElement().getProperty("_access-key", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt an, welche Elemente kontrolliert werden. (https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-controls)
	 *
	 * @param value String
	 */
	public void setAriaControls(final String value) {
		getElement().setProperty("_aria-controls", value.toString());
	}

	/**
	 * Gibt an, welche Elemente kontrolliert werden. (https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-controls)
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getAriaControls() {
		var value = getElement().getProperty("_aria-controls", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt an, welchen aktuellen Auswahlstatus das interaktive Element der Komponente hat. (https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-current)
	 *
	 * @param value String
	 */
	public void setAriaCurrent(final String value) {
		getElement().setProperty("_aria-current", value.toString());
	}

	/**
	 * Gibt an, welchen aktuellen Auswahlstatus das interaktive Element der Komponente hat. (https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-current)
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getAriaCurrent() {
		var value = getElement().getProperty("_aria-current", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt an, ob durch das interaktive Element in der Komponente etwas aufgeklappt wurde. (https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-expanded)
	 *
	 * @param value String
	 */
	public void setAriaExpanded(final String value) {
		getElement().setProperty("_aria-expanded", value.toString());
	}

	/**
	 * Gibt an, ob durch das interaktive Element in der Komponente etwas aufgeklappt wurde. (https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-expanded)
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getAriaExpanded() {
		var value = getElement().getProperty("_aria-expanded", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Setzt die sichtbare oder semantische Beschriftung der Komponente (z.B. Aria-Label, Label, Headline, Caption, Summary usw.).
	 *
	 * @param value String
	 */
	public void setAriaLabel(final String value) {
		getElement().setProperty("_aria-label", value.toString());
	}

	/**
	 * Setzt die sichtbare oder semantische Beschriftung der Komponente (z.B. Aria-Label, Label, Headline, Caption, Summary usw.).
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getAriaLabel() {
		var value = getElement().getProperty("_aria-label", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt an, ob interaktive Element in der Komponente ausgewählt ist (z.B. role=tab). (https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-selected)
	 *
	 * @param value String
	 */
	public void setAriaSelected(final String value) {
		getElement().setProperty("_aria-selected", value.toString());
	}

	/**
	 * Gibt an, ob interaktive Element in der Komponente ausgewählt ist (z.B. role=tab). (https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-selected)
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getAriaSelected() {
		var value = getElement().getProperty("_aria-selected", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Deaktiviert das interaktive Element in der Komponente und erlaubt keine Interaktion mehr damit.
	 *
	 * @param value String
	 */
	public void setDisabled(final String value) {
		getElement().setProperty("_disabled", value.toString());
	}

	/**
	 * Deaktiviert das interaktive Element in der Komponente und erlaubt keine Interaktion mehr damit.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getDisabled() {
		var value = getElement().getProperty("_disabled", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Blendet die Beschriftung (Label) aus und zeigt sie stattdessen mittels eines Tooltips an.
	 *
	 * @param value String
	 */
	public void setHideLabel(final String value) {
		getElement().setProperty("_hide-label", value.toString());
	}

	/**
	 * Blendet die Beschriftung (Label) aus und zeigt sie stattdessen mittels eines Tooltips an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getHideLabel() {
		var value = getElement().getProperty("_hide-label", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Setzt die Iconklasse (z.B.: `_icon="codicon codicon-home`).
	 *
	 * @param value String
	 */
	public void setIcon(final String value) {
		getElement().setProperty("_icon", value.toString());
	}

	/**
	 * Setzt die Iconklasse (z.B.: `_icon="codicon codicon-home`).
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getIcon() {
		var value = getElement().getProperty("_icon", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Blendet die Beschriftung (Label) aus und zeigt sie stattdessen mittels eines Tooltips an.
	 *
	 * @param value String
	 */
	public void setIconOnly(final String value) {
		getElement().setProperty("_icon-only", value.toString());
	}

	/**
	 * Blendet die Beschriftung (Label) aus und zeigt sie stattdessen mittels eines Tooltips an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getIconOnly() {
		var value = getElement().getProperty("_icon-only", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt die interne ID des primären Elements in der Komponente an.
	 *
	 * @param value String
	 */
	public void setId(final String value) {
		getElement().setProperty("_id", value.toString());
	}

	/**
	 * Gibt die interne ID des primären Elements in der Komponente an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getId() {
		var value = getElement().getProperty("_id", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Setzt die sichtbare oder semantische Beschriftung der Komponente (z.B. Aria-Label, Label, Headline, Caption, Summary usw.).
	 *
	 * @param value String
	 */
	public void setLabel(final String value) {
		getElement().setProperty("_label", value.toString());
	}

	/**
	 * Setzt die sichtbare oder semantische Beschriftung der Komponente (z.B. Aria-Label, Label, Headline, Caption, Summary usw.).
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getLabel() {
		var value = getElement().getProperty("_label", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt den technischen Namen des Eingabefeldes an.
	 *
	 * @param value String
	 */
	public void setName(final String value) {
		getElement().setProperty("_name", value.toString());
	}

	/**
	 * Gibt den technischen Namen des Eingabefeldes an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getName() {
		var value = getElement().getProperty("_name", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt die Rolle des primären Elements in der Komponente an.
	 *
	 * @param value String
	 */
	public void setRole(final String value) {
		getElement().setProperty("_role", value.toString());
	}

	/**
	 * Gibt die Rolle des primären Elements in der Komponente an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getRole() {
		var value = getElement().getProperty("_role", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt an, welchen Tab-Index das primäre Element in der Komponente hat. (https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/tabindex)
	 *
	 * @param value String
	 */
	public void setTabIndex(final String value) {
		getElement().setProperty("_tab-index", value.toString());
	}

	/**
	 * Gibt an, welchen Tab-Index das primäre Element in der Komponente hat. (https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/tabindex)
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getTabIndex() {
		var value = getElement().getProperty("_tab-index", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt an, ob der Tooltip bevorzugt entweder oben, rechts, unten oder links angezeigt werden soll.
	 *
	 * @param value String
	 */
	public void setTooltipAlign(final String value) {
		getElement().setProperty("_tooltip-align", value.toString());
	}

	/**
	 * Gibt an, ob der Tooltip bevorzugt entweder oben, rechts, unten oder links angezeigt werden soll.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getTooltipAlign() {
		var value = getElement().getProperty("_tooltip-align", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Setzt den Typ der Komponente oder des interaktiven Elements in der Komponente an.
	 *
	 * @param value String
	 */
	public void setType(final String value) {
		getElement().setProperty("_type", value.toString());
	}

	/**
	 * Setzt den Typ der Komponente oder des interaktiven Elements in der Komponente an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getType() {
		var value = getElement().getProperty("_type", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt einen Wert an, den der Schalter bei einem Klick zurückgibt.
	 *
	 * @param value String
	 */
	public void setValue(final String value) {
		getElement().setProperty("_value", value.toString());
	}

	/**
	 * Gibt einen Wert an, den der Schalter bei einem Klick zurückgibt.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getValue() {
		var value = getElement().getProperty("_value", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}
}
